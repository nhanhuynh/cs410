package com.example.shoes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class GraphActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graph);
		// Show the Up button in the action bar.
		Intent intent = getIntent();
//		String msg = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
//		TextView textview = new TextView(this);
//		textview.setTextSize(40);
//		textview.setText(msg);
//		setContentView(textview);
	}



}
