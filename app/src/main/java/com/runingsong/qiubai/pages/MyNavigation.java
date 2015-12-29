package com.runingsong.qiubai.pages;

import android.content.Context;
import android.support.design.widget.NavigationView;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrator on 15-12-28.
 */
public class MyNavigation extends NavigationView {
    public MyNavigation(Context context) {
        super(context);
    }
    public MyNavigation(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
