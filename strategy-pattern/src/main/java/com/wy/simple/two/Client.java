package com.wy.simple.two;

import com.wy.utils.PropertiesUtil;

public class Client {
    public static void main(String args[]) throws Exception {
        TravelStrategy travelStrategy = (TravelStrategy)Class.forName(PropertiesUtil.getProperties("simpleTwoClassName")).newInstance();
        MyContext mc=new MyContext(travelStrategy);
        mc.travelMethod();
    }
}
