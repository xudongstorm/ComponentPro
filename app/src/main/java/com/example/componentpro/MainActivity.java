package com.example.componentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.baselib.ILoginInterface;
import com.example.baselib.LoginServiceFactory;
import com.example.baselib.MineServiceFactory;
import com.example.baselib.ServiceFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtLogin = findViewById(R.id.bt_login);
        Button mBtMine = findViewById(R.id.bt_mine);
        mBtLogin.setOnClickListener(this);
        mBtMine.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.bt_login){
            LoginServiceFactory.getInstance().getInterface().launchLoginActivity(this);
        }else if(view.getId() == R.id.bt_mine){
            MineServiceFactory.getInstance().getInterface().launchMineActivity(this);
        }
    }
}
