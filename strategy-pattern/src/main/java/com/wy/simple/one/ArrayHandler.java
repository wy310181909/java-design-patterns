package com.wy.simple.one;

public class ArrayHandler
{

	private Sort sortObj;

	public ArrayHandler(Sort sortObj) {
		this.sortObj = sortObj;
	}

	public int[] sort(int arr[])
	{
		sortObj.sort(arr);
		return arr;
	}

}