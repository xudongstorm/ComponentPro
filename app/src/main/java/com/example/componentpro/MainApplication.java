package com.example.componentpro;

import android.app.Application;

import com.example.baselib.MuduleConfig;
import com.example.baselib.IAppInterface;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    private void init() {
        //将主APP的上下文传递给子module
        for(String component : MuduleConfig.COMPONENTS){
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IAppInterface){
                    ((IAppInterface)object).init(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
