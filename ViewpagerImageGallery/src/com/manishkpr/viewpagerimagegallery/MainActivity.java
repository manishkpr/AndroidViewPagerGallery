package com.manishkpr.viewpagerimagegallery;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class MainActivity extends Activity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
    ImageAdapter adapter = new ImageAdapter(this);
    viewPager.setAdapter(adapter);
  }

  
}
