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
import com.runingsong.qiubai.entity.MyResponse;
import com.runingsong.qiubai.tool.CircleTransformation;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 15-12-29.
 */
public class ItemAdapter extends BaseAdapter {
    private Context context;
    private List<MyResponse.ItemsEntity> items;
    private View.OnClickListener onClickListener;
    private int parentWidth;

    public ItemAdapter(Context context) {
        this.context = context;
        items = new ArrayList<>();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
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
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);
            ViewHolder holder = new ViewHolder(convertView);
            holder.commentCount.setOnClickListener(onClickListener);
            convertView.setTag(holder);
        }
        parentWidth = parent.getWidth();
        MyResponse.ItemsEntity itemsEntity = items.get(position);
        ViewHolder viewHolder = (ViewHolder)convertView.getTag();
        if(itemsEntity.getUser()!= null){
            String icon = itemsEntity.getUser().getIcon();
            int id = itemsEntity.getUser().getId();
            if(!"".equals(icon)){
                Picasso.with(context).load(getIconURL(id,icon))
                        .transform(new CircleTransformation())
                        .into(viewHolder.icon);
            }else{
                viewHolder.icon.setImageResource(R.mipmap.nickname);
            }
            viewHolder.name.setText(itemsEntity.getUser().getLogin());
        }else{
            viewHolder.icon.setImageResource(R.mipmap.nickname);
            viewHolder.name.setText("匿名用户");
        }
        String format = itemsEntity.getFormat();
        if("video".equals(format)){
            viewHolder.image.setVisibility(View.VISIBLE);
            viewHolder.play.setVisibility(View.VISIBLE);
            Picasso.with(context).load(itemsEntity.getPicUrl())
                    .resize(parentWidth,0)
                    .into(viewHolder.image);
            Log.d("qys", "getView() returned: " + itemsEntity.getPicUrl());
        }else{
            viewHolder.play.setVisibility(View.GONE);
            if(itemsEntity.getImage()==null){
                viewHolder.image.setVisibility(View.GONE);
            }else{
                viewHolder.image.setVisibility(View.VISIBLE);
                Picasso.with(context).load(getImageURL(itemsEntity.getImage().toString()))
                        .resize(parent.getWidth(),0)
                        .into(viewHolder.image);
            }
        }
        int up = itemsEntity.getVotes().getUp();
        viewHolder.goodCount.setText("好评  " + up);
        String content = itemsEntity.getContent();
        int commentsCount = itemsEntity.getCommentsCount();
        viewHolder.commentCount.setText("评论  " + commentsCount);
        Bundle bundle = new Bundle();
        bundle.putInt("position", position);
        bundle.putInt("width",parentWidth);
        viewHolder.commentCount.setTag(bundle);
        int shareCount = itemsEntity.getShareCount();
        viewHolder.shareCount.setText("分享  "+shareCount);
        viewHolder.content.setText(content);
        return convertView;
    }
    public void newAddAll(Collection<? extends MyResponse.ItemsEntity> collection){
        items.addAll(collection);
        notifyDataSetChanged();
    }
    public static String getImageURL(String image){
        String url = "http://pic.qiushibaike.com/system/pictures/%s/%s/%s/%s";
        Pattern pattern = Pattern.compile("(\\d+)\\d{4}");
        Matcher matcher = pattern.matcher(image);
        matcher.find();
        return String.format(url,matcher.group(1),matcher.group(),"small",image);
    }
    public static String getIconURL(int id,String icon){
        String url = "http://pic.qiushibaike.com/system/avtnew/%s/%s/thumb/%s";
        return String.format(url,id/10000,id,icon);
    }
    private static class ViewHolder{
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
        public ViewHolder(View itemView){
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
}
