package com.example.fitnessappdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import
android.os.Handler;
// needed add in import
public class ActivitySplash extends Activity {
// splash screen delay time
private static final int SPLASH_DISPLAY_TIME = 1000;
@Override
public void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.act_splash);
	new Handler().postDelayed(new Runnable() {
	public void run() {
	Intent intent = new Intent();
	intent.setClass(ActivitySplash.this, ActivityReader.class);
	ActivitySplash.this.startActivity(intent);
	ActivitySplash.this.finish();
	}
	}, SPLASH_DISPLAY_TIME);
	}
	}