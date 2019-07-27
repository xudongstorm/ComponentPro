package com.example.baselib;

public abstract class ServiceFactory<T> {

    public abstract void setInterface(T t);

    public abstract T getInterface();
}
