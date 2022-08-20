package com.wy.simple.two;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DBOperatorSubB extends DBOperator{
    @Override
    public void connDB() {
        log.info("使用视图管理工具连接");
    }
}
