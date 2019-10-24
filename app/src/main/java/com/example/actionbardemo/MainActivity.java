package com.example.actionbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.action_search:
                // Byt till search activity
                Log.d("willy", "Search clicked");
                Intent intent = new Intent(this, second_activity.class);
                startActivity(intent);
                return true;

            case R.id.action_settings:
                // Settings activity
                Log.d("willy", "Settings clicked");
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
