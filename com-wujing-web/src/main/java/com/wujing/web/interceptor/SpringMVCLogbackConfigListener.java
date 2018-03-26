package com.wujing.web.interceptor;

import javax.servlet.ServletContextEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;  
import org.slf4j.impl.StaticLoggerBinder;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.ext.spring.web.LogbackConfigListener;

public class SpringMVCLogbackConfigListener  extends LogbackConfigListener{
	
	private final static Logger logger = LoggerFactory.getLogger(SpringMVCLogbackConfigListener.class);
	
	public void contextInitialized(ServletContextEvent  paramServletContextEvent) {
		super.contextInitialized(paramServletContextEvent);
		LoggerContext localLoggerContext = (LoggerContext) StaticLoggerBinder.getSingleton().getLoggerFactory();
		String smtHost = localLoggerContext.getProperty("smtHost");
		logger.info("this smtHost is {}",smtHost);
	}

}
