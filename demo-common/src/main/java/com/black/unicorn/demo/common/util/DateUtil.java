package com.black.unicorn.demo.common.util;

import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chen
 */
public class DateUtil {
	
	public static long DAY_MILLISECOND = 24 * 60 * 60 * 1000;
	
	/**
	 * 比较两个日期相差天数
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static long getDayGap(Date date1, Date date2) {
		date1 = DateUtils.truncate(date1, Calendar.DAY_OF_MONTH);
		date2 = DateUtils.truncate(date2, Calendar.DAY_OF_MONTH);
		return (date1.getTime() - date2.getTime()) / DAY_MILLISECOND;
	}
	
	public static Date parse(String dateString, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Date date = null;
		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
}
