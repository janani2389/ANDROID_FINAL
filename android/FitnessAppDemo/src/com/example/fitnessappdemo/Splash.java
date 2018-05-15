package com.example.fitnessappdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import
android.os.Handler;
// needed add in import
public class Splash extends Activity {
// splash screen delay time
private static final int SPLASH_DISPLAY_TIME = 5000;
@Override
public void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_splash);
	new Handler().postDelayed(new Runnable() {
	public void run() {
	Intent intent = new Intent();
	intent.setClass(Splash.this, QuoteReaderActivity.class);
	Splash.this.startActivity(intent);
	Splash.this.finish();
	}
	}, SPLASH_DISPLAY_TIME);
	}
	}