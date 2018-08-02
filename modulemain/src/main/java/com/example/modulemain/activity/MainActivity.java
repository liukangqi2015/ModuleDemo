package com.example.modulemain.activity;

import android.content.Intent;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.modulelib.base.BaseActivity;
import com.example.modulemain.R;
import com.example.modulemain.R2;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @OnClick({R2.id.moduleOne,R2.id.fragment})
    public void onClick(View view){
        int viewId = view.getId();
        if (viewId==R.id.moduleOne){
            ARouter.getInstance().build("/moduleone/ModuleOneActivity").navigation();
        }else if (viewId==R.id.fragment){
            startActivity(new Intent(this,ShowFragmentActivity.class));
        }
    }

}
