package cn.yenmor.passwordGeter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateGeter{
	//public String date;
	
	public static String GetDate() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//设置日期格式
		String date = df.format(new Date());
		return date;
	}

}
