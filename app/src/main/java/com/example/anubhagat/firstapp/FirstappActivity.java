package com.example.anubhagat.firstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FirstappActivity extends Activity {

    public EditText etWords;
    public TextView tvLable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstapp);
        etWords = (EditText) findViewById(R.id.etWords);
        tvLable = (TextView) findViewById(R.id.tvLabel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.firstapp, menu);
        return true;
    }

    public void onSubmit(View v) {
        String fieldValue = etWords.getText().toString();
        Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
        tvLable.setText(fieldValue);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
