package com.tiange.service.impl;

import java.util.Date;


import com.tiange.service.MyService;

public class MyServiceImpl implements MyService
{
	@Override
	public void say()
	{
		System.out.println("Service say hello work!!!" + new Date());
		
	}
}
