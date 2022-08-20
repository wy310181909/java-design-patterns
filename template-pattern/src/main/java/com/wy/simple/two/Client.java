package com.wy.simple.two;

import com.wy.utils.PropertiesUtil;

public class Client {
    public static void main(String a[]) throws Exception {
        DBOperator dbOperator = (DBOperator)Class.forName(PropertiesUtil.getProperties("simpleTwoClassName")).newInstance();
        dbOperator.process();
    }
}
