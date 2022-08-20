package com.wy.simple.one;

import com.wy.utils.PropertiesUtil;

public class Client {
    public static void main(String args[]) throws Exception {
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        int result[];

        Sort simpleOneClassName = (Sort) Class.forName(PropertiesUtil.getProperties("simpleOneClassName")).newInstance();
        ArrayHandler ah = new ArrayHandler(simpleOneClassName);
        result = ah.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}