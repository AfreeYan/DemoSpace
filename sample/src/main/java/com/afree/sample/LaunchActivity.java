package com.afree.sample;


import android.os.Bundle;

import com.afree.framework.base.activity.BaseToolBarActivity;

/**
 * Created by afree on 10/28/15.
 */
public class LaunchActivity extends BaseToolBarActivity{

  @Override
  protected void init(Bundle savedInstanceState) {
    super.init(savedInstanceState);
    replaceFragment(LauncherFragment.class);
  }

}
