package com.runingsong.qiubai.adapters;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.runingsong.qiubai.R;
import com.runingsong.qiubai.entity.Comment;
import com.runingsong.qiubai.entity.MyResponse;
import com.runingsong.qiubai.tool.CircleTransformation;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 15-12-30.
 */
public class CommentAdapter extends BaseAdapter {
    private Context context;
    private List<Comment.ItemsEntity> items;
    private Bundle bundle;
    private int width;

    public CommentAdapter(Context context,Bundle bundle) {
        this.context = context;
        this.bundle =bundle;
        items = new ArrayList<>();
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }
    @Override
    public int getItemViewType(int position) {
        if(position==0){
            return 0;
        }else{
            return 1;
        }
    }
    @Override
    public int getCount() {
        return items.size();
    }
    @Override
    public Object getItem(int position) {
        return items.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        int type = getItemViewType(position);
        Log.d("View", "getView() returned: " + position+"---"+convertView);

        if(convertView == null){
            if(position==0){
                convertView = LayoutInflater.from(context).inflate(R.layout.comment_layout,parent,false);
                ViewHolderTop holderTop = new ViewHolderTop(convertView);
                convertView.setTag(holderTop);
            }else{
                convertView = LayoutInflater.from(context).inflate(R.layout.comment_layout_eve,parent,false);
                ViewHolderBottom holderBottom = new ViewHolderBottom(convertView);
                convertView.setTag(holderBottom);
            }
        }
        if(position==0){
                ViewHolderTop  viewHolderTop = (ViewHolderTop)convertView.getTag();
                Object obj = bundle.get("content");
                width = bundle.getInt("width");
                if(obj !=null && obj instanceof MyResponse.ItemsEntity ){
                    MyResponse.ItemsEntity itemsEntity = (MyResponse.ItemsEntity)obj;
                    if(itemsEntity.getUser()!= null){
                        String icon = itemsEntity.getUser().getIcon();
                        int id = itemsEntity.getUser().getId();
                        if(!"".equals(icon)){
                            Picasso.with(context).load(userIcon(id, icon))
                                    .transform(new CircleTransformation())
                                    .into(viewHolderTop.icon);
                        }else{
                            viewHolderTop.icon.setImageResource(R.mipmap.nickname);
                        }
                        viewHolderTop.name.setText(itemsEntity.getUser().getLogin());
                    }else{
                        viewHolderTop.icon.setImageResource(R.mipmap.nickname);
                        viewHolderTop.name.setText("匿名用户");
                    }
                    String format = itemsEntity.getFormat();
                    if("video".equals(format)){
                        viewHolderTop.image.setVisibility(View.VISIBLE);
                        viewHolderTop.play.setVisibility(View.VISIBLE);
                        Picasso.with(context).load(itemsEntity.getPicUrl())
                                .resize(width, 0)
                                .into(viewHolderTop.image);
                        Log.d("qys", "getView() returned: " + itemsEntity.getPicUrl());
                    }else{
                        viewHolderTop.play.setVisibility(View.GONE);
                        if(itemsEntity.getImage()==null){
                            viewHolderTop.image.setVisibility(View.GONE);
                        }else{
                            viewHolderTop.image.setVisibility(View.VISIBLE);
                            Picasso.with(context).load(getImageURL(itemsEntity.getImage().toString()))
                                    .resize(width,0)
                                    .into(viewHolderTop.image);
                        }
                    }

                    int up = itemsEntity.getVotes().getUp();
                    viewHolderTop.goodCount.setText("好评  "+up);
                    String content = itemsEntity.getContent();
                    int commentsCount = itemsEntity.getCommentsCount();
                    viewHolderTop.commentCount.setText("评论  " + commentsCount);
//        commentCount.setTag(position);
                    int shareCount = itemsEntity.getShareCount();
                    viewHolderTop.shareCount.setText("分享  " + shareCount);
                    viewHolderTop.content.setText(content);
                }
        }else{
            ViewHolderBottom  holderbottom = (ViewHolderBottom)convertView.getTag();
            Log.d("View", "getView() returned: " + holderbottom);
            Comment.ItemsEntity itemsEntity = items.get(position);
            int id = itemsEntity.getUser().getId();
            String icon = itemsEntity.getUser().getIcon();
            if(!"".equals(icon)){
                Picasso.with(context).load(userIcon(id, icon))
                        .transform(new CircleTransformation())
                        .into(holderbottom.imageView);
            }else{
                holderbottom.imageView.setImageResource(R.mipmap.nickname);
            }
            holderbottom.name.setText(itemsEntity.getUser().getLogin());
            holderbottom.content.setText(itemsEntity.getContent());
        }
        return convertView;
    }
    public void newAddAll(Collection<? extends Comment.ItemsEntity> collection){
        items.addAll(collection);
        notifyDataSetInvalidated();
    }
    public static String getImageURL(String image){
        String url = "http://pic.qiushibaike.com/system/pictures/%s/%s/%s/%s";
        Pattern pattern = Pattern.compile("(\\d+)\\d{4}");
        Matcher matcher = pattern.matcher(image);
        matcher.find();
        return String.format(url,matcher.group(1),matcher.group(),"small",image);
    }
    public String userIcon(int id,String icon){
        String url ="http://pic.qiushibaike.com/system/avtnew/%s/%s/thumb/%s";
        return String.format(url,id/10000,id,icon);
    }
    public  static class ViewHolderTop{
        private ImageView icon;
        private TextView name;
        private TextView content;
        private ImageView image;
        private TextView goodCount;
        private TextView commentCount;
        private TextView shareCount;
        private RadioButton support;
        private RadioButton down;
        private ImageView play;
        public ViewHolderTop(View itemView){
            icon =(ImageView)itemView.findViewById(R.id.self_user_icon);
            name = (TextView)itemView.findViewById(R.id.self_user_name);
            content = (TextView) itemView.findViewById(R.id.self_content);
            image = (ImageView) itemView.findViewById(R.id.self_image);
            goodCount = (TextView)itemView.findViewById(R.id.good);
            commentCount =(TextView)itemView.findViewById(R.id.comment);
            shareCount = (TextView)itemView.findViewById(R.id.share);
            support = (RadioButton)itemView.findViewById(R.id.support);
            down = (RadioButton)itemView.findViewById(R.id.down);
            play = (ImageView)itemView.findViewById(R.id.play);
        }
    }
    public  static class ViewHolderBottom{
        private ImageView imageView;
        private TextView name;
        private TextView content;
        public ViewHolderBottom(View v) {
            imageView = (ImageView)v.findViewById(R.id.icon);
            name = (TextView)v.findViewById(R.id.name);
            content = (TextView)v.findViewById(R.id.content);
        }
    }

}
