package com.example.loginmodule;

import android.content.Context;
import android.content.Intent;

import com.example.baselib.ILoginInterface;

public class LoginService implements ILoginInterface {

    @Override
    public void launchLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
 }
