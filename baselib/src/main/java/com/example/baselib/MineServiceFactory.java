package com.example.baselib;

public class MineServiceFactory extends ServiceFactory<IMineInterface> {

    private static MineServiceFactory serviceFactory;
    private MineServiceFactory(){}
    private IMineInterface mineInterface;

    public static MineServiceFactory getInstance(){
        if(serviceFactory == null){
            serviceFactory = new MineServiceFactory();
        }
        return serviceFactory;
    }

    @Override
    public void setInterface(IMineInterface mineInterface) {
        this.mineInterface = mineInterface;
    }

    @Override
    public IMineInterface getInterface() {
        return mineInterface;
    }
}
