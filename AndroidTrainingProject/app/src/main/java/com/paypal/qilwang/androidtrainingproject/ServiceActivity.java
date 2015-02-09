package com.paypal.qilwang.androidtrainingproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ServiceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_service);
	}

	// Start the service
	public void startService(View view) {
		startService(new Intent(this, MyService.class));
	}

	// Stop the service
	public void stopService(View view) {
		stopService(new Intent(this, MyService.class));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

//		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}