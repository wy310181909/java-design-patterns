package com.wy.simple.one;

import com.wy.utils.PropertiesUtil;

public class Client
{
	public static void main(String a[]) throws Exception {
		BankTemplateMethod bankTemplateMethod = (BankTemplateMethod) Class.forName(PropertiesUtil.getProperties("simpleOneClassName")).newInstance();
		bankTemplateMethod.process();
	}
}
