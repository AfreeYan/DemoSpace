package com.afree.framework.base.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.afree.framework.R;
import com.afree.framework.base.fragment.AbsFragment;

/**
 * Created by afree on 10/28/15.
 */
public class BaseActivity extends AbsActivity {

  protected AbsFragment mFragment;

  @Override
  protected void init(Bundle savedInstanceState) {}

  @Override
  protected int getLayoutId() {
    return R.layout.activity_base;
  }

  protected void replaceFragment(Class<? extends AbsFragment> fragmentClazz) {
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fl_container_base, createFragment(fragmentClazz,null));
    transaction.commitAllowingStateLoss();
  }

  protected void replaceFragment(Class<? extends AbsFragment> fragmentClazz, Bundle bundle) {
    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
    transaction.replace(R.id.fl_container_base, createFragment(fragmentClazz,bundle));
    transaction.commitAllowingStateLoss();
  }

  protected AbsFragment createFragment(Class<? extends AbsFragment> fragmentClazz, Bundle bundle){
    if (fragmentClazz == null) {
      return null;
    }
    mFragment =  (AbsFragment) Fragment.instantiate(this, fragmentClazz.getName(), bundle);
    return mFragment;
  }


}
