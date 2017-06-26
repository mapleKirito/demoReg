package com.maple.utils;

public class DemoRegUtil {
	public static String getDemoRegCode(String machineCode,String serialNumber){
		
		return Encrypt.getMD5(machineCode + serialNumber);
	}
}
