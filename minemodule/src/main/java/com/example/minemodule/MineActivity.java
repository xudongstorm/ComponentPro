package com.example.minemodule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baselib.LoginServiceFactory;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);

        Button btMine = findViewById(R.id.bt_mine_to_login);
        btMine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginServiceFactory.getInstance().getInterface().launch(MineActivity.this);
            }
        });
    }
}
