package com.gangane.construction.util;

import java.io.BufferedReader;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.json.JSONObject;

public class Utility {
	
	
	public static JSONObject extractJsonFromRequest(HttpServletRequest request) throws Exception {
		
		StringBuffer sb = new StringBuffer();
		JSONObject jObject = null;
		
		String line =null;
		try {
			
			BufferedReader bufferedReader = request.getReader();
			while((line = bufferedReader.readLine()) !=null) {
				sb.append(line);
			}
			jObject = new JSONObject (sb.toString());
		}catch(Exception e) {
			throw e;
		}
		
		
		return jObject;
		
		
	}
	
	public static Date getFirsDateOfTheMonth() {
		 Calendar calendar = Calendar.getInstance(); 
		 calendar.set(Calendar.DAY_OF_MONTH,1);
		 calendar.set(Calendar.HOUR_OF_DAY,0);
		 calendar.set(Calendar.MINUTE,0);
		 calendar.set(Calendar.SECOND,0);
		 
		 return calendar.getTime();
	}

}
