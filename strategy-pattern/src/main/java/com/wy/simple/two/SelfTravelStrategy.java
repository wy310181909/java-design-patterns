package com.wy.simple.two;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelfTravelStrategy implements TravelStrategy{
    @Override
    public void travelMethod() {
      log.info("自己去");
    }
}
