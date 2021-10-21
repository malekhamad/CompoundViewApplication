package com.geniusmind.compoundviewapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView ;
    private TextView mTextView ;

    String secretKey = "hallo world" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init(secretKey);

    }

    private void init(String s){
        mRecyclerView = findViewById(R.id.recycler_view);
        mTextView = findViewById(R.id.text_view);

        mTextView.setText(s);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setHasFixedSize(true);
    }
}