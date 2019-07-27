package com.example.baselib;

public class LoginServiceFactory extends ServiceFactory<ILoginInterface>{


    private static LoginServiceFactory serviceFactory;
    private LoginServiceFactory(){}
    private ILoginInterface loginInterface;

    public static LoginServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new LoginServiceFactory();
        }
        return serviceFactory;
    }

    @Override
    public void setInterface(ILoginInterface loginInterface) {
        this.loginInterface = loginInterface;
    }

    @Override
    public ILoginInterface getInterface() {
        return loginInterface;
    }
}
