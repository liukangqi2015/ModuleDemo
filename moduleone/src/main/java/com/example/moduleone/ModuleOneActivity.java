package com.example.moduleone;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.modulelib.base.BaseActivity;

@Route(path = "/moduleone/ModuleOneFragment")
public class ModuleOneActivity extends BaseActivity {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_one;
    }
}
