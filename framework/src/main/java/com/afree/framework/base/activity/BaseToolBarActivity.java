package com.afree.framework.base.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.afree.framework.R;

/**
 * Created by afree on 10/28/15.
 */
public class BaseToolBarActivity extends BaseActivity{

  @Override
  protected void init(Bundle savedInstanceState) {
    super.init(savedInstanceState);

    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

  }

  @Override
  protected int getLayoutId() {
    return R.layout.activity_base_tool_bar;
  }


}
