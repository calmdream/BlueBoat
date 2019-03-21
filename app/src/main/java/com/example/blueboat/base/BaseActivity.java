package com.example.blueboat.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

public class BaseActivity extends SupportActivity implements BaseView {

    private static final String TAG = "BaseActivity";

    protected int setLayoutView(){
        return 0;
    }

    protected void initView(){}

    protected void initData(){}

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(setLayoutView());
        ButterKnife.bind(this);
        super.onCreate(savedInstanceState);

        initView();
        initData();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
//        MobclickAgent.onResume(this);//添加友盟分析
    }

    @Override
    protected void onPause() {
        super.onPause();
        //TODO 添加友盟分析
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg) {

    }

    @Override
    public void showFinished() {

    }
}
