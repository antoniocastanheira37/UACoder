package com.example.bottombar.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.five_tabs_custom_colors).setOnClickListener(this);
        findViewById(R.id.badges).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Class clazz = null;

        switch (v.getId()) {
            case R.id.five_tabs_custom_colors:
                clazz = CustomColorAndFontActivity.class;
                break;
            case R.id.badges:
                clazz = BadgeActivity.class;
                break;
        }

        startActivity(new Intent(this, clazz));
    }
}
