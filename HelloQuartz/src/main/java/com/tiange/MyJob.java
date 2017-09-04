package com.tiange;

import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
public class MyJob extends QuartzJobBean
{

	@Override
	protected void executeInternal(JobExecutionContext arg0) throws JobExecutionException
	{
		System.out.println("Hello Quartz and Spring, now is:" + new Date());
		
	}

}
