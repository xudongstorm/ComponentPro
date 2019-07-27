package com.example.minemodule;

import android.app.Application;

import com.example.baselib.IAppInterface;
import com.example.baselib.MineServiceFactory;

public class MineApplication extends Application implements IAppInterface {
    private static Application application;
    public static Application getApplication(){
        return application;
    }

    @Override
    public void init(Application app) {
        application = app;
        MineServiceFactory.getInstance().setInterface(new MineService());
    }
}
