package com.afree.framework.base.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by afree on 10/28/15.
 */
public abstract class AbsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayoutId());
    init(savedInstanceState);
  }

  protected abstract void init(Bundle savedInstanceState);

  protected abstract int getLayoutId();

}
