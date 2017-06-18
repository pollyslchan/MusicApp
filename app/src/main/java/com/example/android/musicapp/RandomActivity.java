package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);

        TextView collection = (TextView) findViewById(R.id.collection);
        collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent collectionIntent = new Intent(RandomActivity.this, CollectionActivity.class);
                startActivity(collectionIntent);
            }
        });

        TextView recommend = (TextView) findViewById(R.id.recommend);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recommendIntent = new Intent(RandomActivity.this, RecommendActivity.class);
                startActivity(recommendIntent);
            }
        });

//        TextView home = (TextView) findViewById(R.id.home);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent homeIntent = new Intent(RandomActivity.this, MainActivity.class);
//                startActivity(homeIntent);
//            }
//        });
    }
}
