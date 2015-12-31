package com.runingsong.qiubai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.runingsong.qiubai.adapters.CommentAdapter;
import com.runingsong.qiubai.entity.Comment;
import com.runingsong.qiubai.entity.QysService;
import com.runingsong.qiubai.entity.MyResponse;

import java.util.List;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class CommentAtivity extends AppCompatActivity implements Callback<Comment> {
    private ListView listView;
    private CommentAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comment_ativity);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("user");
        Object obj = bundle.get("content");
        MyResponse.ItemsEntity itemsEntity = (MyResponse.ItemsEntity)obj;
        adapter = new CommentAdapter(this,bundle);
        listView = (ListView)findViewById(R.id.comment_list);
        listView.setAdapter(adapter);
        Retrofit build = new Retrofit.Builder().baseUrl("http://m2.qiushibaike.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        QysService service = build.create(QysService.class);
        int id = itemsEntity.getId();
        Call<Comment> call = service.getListComment(String.valueOf(id), 1);
        call.enqueue(this);
    }
    @Override
    public void onResponse(retrofit.Response<Comment> response, Retrofit retrofit) {
            List<Comment.ItemsEntity> items = response.body().getItems();
            adapter.newAddAll(items);
    }
    @Override
    public void onFailure(Throwable t) {

    }
}
