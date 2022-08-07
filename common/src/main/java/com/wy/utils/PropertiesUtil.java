package com.wy.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    static final String FILE_PATH = "D:\\Projects\\other\\java-design-patterns\\factory-pattern\\src\\main\\resources\\config.properties";
    static final String RESOURCE_PATH = "config.properties";

    /**
     * 默认用 fileInputStream
     * 因为类加载器用了 bufferInputStream装饰器（没必要）
     * @param value
     * @return
     * @throws Exception
     */
    public static String getProperties(String value) throws Exception{
        return getProperties1(value);
    }

    /**
     * 使用FileInputStream读取数据
     * Properties 默认一次读取 8192 字节 和bufferInputStream 装饰器的默认大小一样 所以不使用bufferInputStream
     */
    public static String getProperties1(String value) throws Exception{
        Properties properties = new Properties();
        try (InputStream in = new FileInputStream(FILE_PATH)) {
            properties.load(in);
            return properties.getProperty(value);
        }
    }

    /**
     * 使用类加载器读取配置文件
     */
    public static String getProperties2(String value) throws Exception {
        Properties properties = new Properties();
        try (InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream(RESOURCE_PATH)) {
            properties.load(in);
            return properties.getProperty(value);
        }


    }
}
