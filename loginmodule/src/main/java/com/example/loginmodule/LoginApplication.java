package com.example.loginmodule;

import android.app.Application;

import com.example.baselib.IAppInterface;
import com.example.baselib.LoginServiceFactory;

public class LoginApplication extends Application implements IAppInterface {

    private static Application application;
    public static Application getApplication(){
        return application;
    }

    @Override
    public void init(Application app) {
        application = app;
        LoginServiceFactory.getInstance().setInterface(new LoginService());
    }

}
