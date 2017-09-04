package com.tiange.task;

import java.util.Date;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.tiange.service.MyService;

public class MyJob extends QuartzJobBean
{
	private MyService myService;
	private String name;
	public String getName()
	{
		return name;
	}


	public void setName(String name)
	{
		this.name = name;
	}


	public MyService getMyService()
	{
		return myService;
	}


	public void setMyService(MyService myService)
	{
		this.myService = myService;
	}

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException
	{
		System.out.println("Hello Quartz and Spring, now is:" + new Date());
		System.out.println(name);
		System.out.println(myService);
		myService.say();
		
	}

}
