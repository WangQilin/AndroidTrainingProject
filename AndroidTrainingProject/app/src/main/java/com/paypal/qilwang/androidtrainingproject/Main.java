package com.paypal.qilwang.androidtrainingproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Main extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button accelerometer = (Button) findViewById(R.id.accelerometer);
        Button battery = (Button) findViewById(R.id.battery);
        Button phone_properties = (Button) findViewById(R.id.phone_properties);
        Button notification = (Button) findViewById(R.id.notification);
        Button sqlite = (Button) findViewById(R.id.sqlite);
        Button searchable = (Button) findViewById(R.id.searchable);
        Button webview = (Button) findViewById(R.id.webview);
        Button video_view = (Button) findViewById(R.id.video_view);
        Button take_photo_and_email = (Button) findViewById(R.id.take_photo_and_email);
        Button face_detection = (Button) findViewById(R.id.face_detection);
        Button fragment = (Button) findViewById(R.id.fragment);
        Button simple_intent = (Button) findViewById(R.id.simple_intent);
        Button test_layout = (Button) findViewById(R.id.test_layout);
        Button service = (Button) findViewById(R.id.service);

        accelerometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, SensorDemo.class));
            }
        });

        battery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, BatteryStatus.class));
            }
        });

        phone_properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, PhonePropertiesExample.class));
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, NotifsExample.class));
            }
        });

        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, SQLiteExample1.class));
            }
        });

        searchable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, SearchViewActivity.class));
            }
        });

        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, WebViewActivity.class));
            }
        });

        video_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, AndroidVideoViewExample.class));
            }
        });

        // todo: figure out why it doesn't work as expected?
        take_photo_and_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, TakePhotoAndEmail.class));
            }
        });

        face_detection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, FaceDetectionActivity.class));
            }
        });

        fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, FragmentActivity.class));
            }
        });

        simple_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, SimpleIntentActivityOne.class));
            }
        });

        test_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, TestLayoutActivity.class));
            }
        });

        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main.this, ServiceActivity.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
