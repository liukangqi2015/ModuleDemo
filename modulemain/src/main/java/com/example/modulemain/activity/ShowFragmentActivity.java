package com.example.modulemain.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.modulelib.base.BaseActivity;
import com.example.modulemain.R;

public class ShowFragmentActivity extends BaseActivity {
    private Fragment moduleOneFragment;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_show_fragment;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        moduleOneFragment= (Fragment) ARouter.getInstance().build("/moduleone/ModuleOneFragment").navigation();
    }

    @Override
    protected void initData() {
        super.initData();
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add(R.id.fl_fragment,moduleOneFragment).commit();
    }
}
