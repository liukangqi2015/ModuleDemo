package com.example.moduleone.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.modulelib.base.BaseFragment;
import com.example.moduleone.R;

@Route(path = "/moduleone/ModuleOneFragment")
public class ModuleOneFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_one_show;
    }
}
