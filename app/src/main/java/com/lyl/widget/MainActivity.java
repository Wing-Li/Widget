package com.lyl.widget;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.txt);

        String main = getIntent().getStringExtra("main");
        if (!TextUtils.isEmpty(main)) {
            mTextView.setText(main);
        }
    }
}
