package com.example.shoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StatisticsActivity extends Activity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_statistics);
		Intent intent = getIntent();
		String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

	}
}
