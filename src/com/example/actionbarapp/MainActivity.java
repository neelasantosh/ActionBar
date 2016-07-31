package com.example.actionbarapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class MainActivity extends Activity implements
		ActionBar.OnNavigationListener {
	EditText editNum;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		editNum = (EditText) findViewById(R.id.editText1);
		// change activity icon in action bar
		ActionBar actionBar = getActionBar();
		actionBar.setIcon(R.drawable.dosa);
		actionBar.setTitle("Home");
		// add spinner navigation to action bar
		String[] optionArray = { "About Us", "Help", "Exit" };
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				MainActivity.this, R.layout.spinner_item, optionArray);

		// hide title are and enable spinner on actionBar
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_LIST);
		actionBar.setListNavigationCallbacks(adapter, null);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_actions, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_go) {
			Intent inNext = new Intent(MainActivity.this, NextActivity.class);
			startActivity(inNext);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onNavigationItemSelected(int itemPosition, long itemId) {
		// TODO Auto-generated method stub
		if (itemPosition == 2)
			finish();
		return false;
	}
}
