package com.YetloUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro;
	public ReadConfig()
	{
		try {
			FileInputStream strm=new FileInputStream("./Configuration/config.properties");
			pro=new Properties();
			pro.load(strm);

		}catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
		public String getApplication()
		{
			String url=pro.getProperty("baseURL");
			return url;
		}
		
		public String getEmail()
		{
			String email=pro.getProperty("Email");
			return email;
		}
		
		public String getPassword()
		{
			String psw=pro.getProperty("Password");
			return psw;
		}
		
		public String getChromePath()
		{
			String chrm=pro.getProperty("Chromepath");
			return chrm;
		}


	}
