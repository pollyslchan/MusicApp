package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CollectionActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collection);

        TextView random = (TextView) findViewById(R.id.random);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randomIntent = new Intent(CollectionActivity.this, RandomActivity.class);
                startActivity(randomIntent);
            }
        });

        TextView recommend = (TextView) findViewById(R.id.recommend);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recommendIntent = new Intent(CollectionActivity.this, RecommendActivity.class);
                startActivity(recommendIntent);
            }
        });

//        TextView home = (TextView) findViewById(R.id.home);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent homeIntent = new Intent(CollectionActivity.this, MainActivity.class);
//                startActivity(homeIntent);
//            }
//        });

    }
}
