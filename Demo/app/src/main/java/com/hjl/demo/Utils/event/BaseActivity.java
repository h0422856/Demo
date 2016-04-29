package com.hjl.demo.Utils.event;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;

/**
 * [description about this class]
 *
 * @author hujiao
 * @version [Demo, 2016/04/06 11:40]
 * @copyright Copyright 2010 RD information technology Co.,ltd.. All Rights Reserved.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        afterSetContentView();
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        afterSetContentView();
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        super.setContentView(view, params);
        afterSetContentView();
    }
    /**
     * setContentView之后调用, 进行view的初始化等操作
     */
    private void afterSetContentView()
    {
        ViewUtils.inject(this);
        init();
    }

    protected void init() {
    }
}
