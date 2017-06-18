package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find collection TextView and set onclicklistener to go to CollectionActivity
        TextView collection = (TextView) findViewById(R.id.collection);
        collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent collectionIntent = new Intent(MainActivity.this, CollectionActivity.class);
                startActivity(collectionIntent);
            }
        });

        TextView random = (TextView) findViewById(R.id.random);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randomIntent = new Intent(MainActivity.this, RandomActivity.class);
                startActivity(randomIntent);
            }
        });

        TextView recommend = (TextView) findViewById(R.id.recommend);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recommendIntent = new Intent(MainActivity.this, RecommendActivity.class);
                startActivity(recommendIntent);
            }
        });
    }


}
