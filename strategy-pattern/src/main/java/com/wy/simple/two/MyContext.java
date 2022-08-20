package com.wy.simple.two;

public class MyContext {
    private TravelStrategy ts;
    public MyContext(TravelStrategy ts)
    {
        this.ts=ts;
    }
    public void travelMethod()
    {
        ts.travelMethod();
    }
}
