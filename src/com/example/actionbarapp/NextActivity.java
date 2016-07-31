package com.example.actionbarapp;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class NextActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		
		//enable back navigation button on actionbar
		ActionBar actionBar = getActionBar();
		actionBar.setTitle("Next");
		actionBar.setDisplayHomeAsUpEnabled(true);
		
	}

}
