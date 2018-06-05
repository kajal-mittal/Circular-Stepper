package com.km.democircularstepper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnAdd;
    private Button mBtnReset;
    private CustomView mCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
        init();
    }

    private void init() {
        mBtnAdd.setOnClickListener(this);
        mBtnReset.setOnClickListener(this);
    }

    private void bindViews() {
        mBtnAdd= (Button) findViewById(R.id.btn_add);
        mBtnReset= (Button) findViewById(R.id.btn_reset);
        mCustomView= (CustomView) findViewById(R.id.custom_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_add:
                mCustomView.incrementStep();
                break;
            case R.id.btn_reset:
                mCustomView.reset();
                break;
        }

    }
}
