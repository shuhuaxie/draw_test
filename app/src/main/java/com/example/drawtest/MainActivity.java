/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.example.drawtest;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.to_path_effect).setOnClickListener(v -> {
            startActivity(new Intent(this, PathEffectActivity.class));
        });
    }
}
