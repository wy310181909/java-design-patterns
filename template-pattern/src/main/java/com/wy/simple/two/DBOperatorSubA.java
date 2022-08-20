package com.wy.simple.two;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBOperatorSubA extends DBOperator{
    @Override
    public void connDB() {
        log.info("写代码使用jdbc连接");
    }
}
