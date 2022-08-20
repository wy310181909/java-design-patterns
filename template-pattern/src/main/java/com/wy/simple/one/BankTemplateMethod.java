package com.wy.simple.one;

public abstract class BankTemplateMethod
{
    public void takeNumber()
	{
		System.out.println("点数");
	}
	
	public abstract void transact();
	
	public void evaluate()
	{
		System.out.println("结算");
	}

    public void process()
    {
        this.takeNumber();
        this.transact();
        this.evaluate();
    }
} 