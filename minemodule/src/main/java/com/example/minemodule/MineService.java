package com.example.minemodule;

import android.content.Context;
import android.content.Intent;

import com.example.baselib.IMineInterface;

public class MineService implements IMineInterface {

    @Override
    public void launchMineActivity(Context context) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }
}
