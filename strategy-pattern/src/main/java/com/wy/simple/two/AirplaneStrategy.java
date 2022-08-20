package com.wy.simple.two;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AirplaneStrategy implements TravelStrategy{
    @Override
    public void travelMethod() {
        log.info("坐飞机");
    }
}
