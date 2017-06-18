package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecommendActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        TextView collection = (TextView) findViewById(R.id.collection);
        collection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent collectionIntent = new Intent(RecommendActivity.this, CollectionActivity.class);
                startActivity(collectionIntent);
            }
        });

        TextView random = (TextView) findViewById(R.id.random);
        random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent randomIntent = new Intent(RecommendActivity.this, RandomActivity.class);
                startActivity(randomIntent);
            }
        });

//        TextView home = (TextView) findViewById(R.id.home);
//        home.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent homeIntent = new Intent(RecommendActivity.this, MainActivity.class);
//                startActivity(homeIntent);
//            }
//        });
    }
}
