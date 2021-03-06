package com.example.modulelib.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.Unbinder;


public abstract class BaseFragment extends Fragment {

    /**
     * 上下文对象
     */
    protected Context mContext;
    /**
     * 所属activity
     */
    protected Activity mActivity;
    /**
     * ButterKnife
     */
    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //加载布局
        return inflater.inflate(getLayoutId(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        //注册butterknife
        mUnbinder = ButterKnife.bind(this,view);
        mContext = getContext();
        mActivity = (Activity) getContext();
        initView(view,savedInstanceState);
        initData();
    }

    /**
     * 获取当前layouty的布局ID,用于设置当前布局
     * 交由子类实现
     * @return 布局ID
     */
    protected abstract int getLayoutId();

    /**
     * 初始化view
     * 子类实现 控件绑定、视图初始化等内容
     * @param savedInstanceState savedInstanceState
     */
    protected void initView(View view, Bundle savedInstanceState) {
    }

    /**
     * 初始化数据
     * 子类可以复写此方法初始化子类数据
     */
    protected void initData() {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

}
