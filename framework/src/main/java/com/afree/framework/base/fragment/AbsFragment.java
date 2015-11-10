package com.afree.framework.base.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by afree on 10/28/15.
 */
public abstract class AbsFragment extends Fragment {
  protected View mContainer;

  @Override
  public final View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    mContainer = inflater.inflate(getLayoutId(),container,false);
    return mContainer;
  }

  @Override
  public final void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    if(mContainer !=null){
      init(savedInstanceState);
    }
  }

  protected abstract void init(Bundle savedInstanceState);

  protected abstract int getLayoutId();


}
