package com.example.fitnessappdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Tracker extends Activity {
	// splash screen delay time
	private static final int SPLASH_DISPLAY_TIME = 500000;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tracker_splash);
		new Handler().postDelayed(new Runnable() {
		public void run() {
		Intent intent = new Intent();
		intent.setClass(Tracker.this, TipsQuoteReaderActivity.class);
		Tracker.this.startActivity(intent);
		Tracker.this.finish();
		}
		}, SPLASH_DISPLAY_TIME);
		}
}
