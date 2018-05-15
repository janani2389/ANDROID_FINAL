package com.example.fitnessappdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import
android.os.Handler;
// needed add in import
public class ContactSplash extends Activity {
// splash screen delay time
private static final int SPLASH_DISPLAY_TIME = 1000;
@Override
public void onCreate(Bundle savedInstanceState) {
	
	super.onCreate(savedInstanceState);
	setContentView(R.layout.contact_splash);
	new Handler().postDelayed(new Runnable() {
	public void run() {
	Intent intent = new Intent();
	intent.setClass(ContactSplash.this, ContactActivity.class);
	ContactSplash.this.startActivity(intent);
	ContactSplash.this.finish();
	}
	}, SPLASH_DISPLAY_TIME);
	}
	}