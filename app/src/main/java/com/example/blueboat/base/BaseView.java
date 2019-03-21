package com.example.blueboat.base;

/**
 * 提供基础方法的view
 */
public interface BaseView {

    /**
     * 正在加载
     */
    void showLoading();
    //
    /**
     * 隐藏加载
     */
    void hideLoading();

    /**
     * 请求异常提示
     */
    void showError(String msg);

    /**
     * 请求完成
     */
    void showFinished();

}
