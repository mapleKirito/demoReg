package com.maple.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsolePrint {
	public static void PrintLog(String str){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("ConsoleInfo["+df.format(new Date())+"]:"+str);
		
	}
}
