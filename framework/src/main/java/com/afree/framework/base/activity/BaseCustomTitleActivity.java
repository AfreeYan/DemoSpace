package com.afree.framework.base.activity;

import android.os.Bundle;

import com.afree.framework.R;

/**
 * Created by afree on 10/28/15.
 */
public class BaseCustomTitleActivity extends BaseActivity {

  @Override
  protected void init(Bundle savedInstanceState) {
    super.init(savedInstanceState);
    initToolBar();
  }

  private void initToolBar() {
    getSupportActionBar().setHomeAsUpIndicator(R.mipmap.base_title_back);

  }

  @Override
  protected int getLayoutId() {
    return R.layout.activity_base_tool_bar;
  }



}
