package com.sist.util;

import java.text.SimpleDateFormat;
import java.util.*;

public class 라이브러리_5 {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-M-d");
		
		String today=sdf.format(date);
		
		StringTokenizer st=new StringTokenizer(today,"-");
		int year=Integer.parseInt(st.nextToken());
		int month=Integer.parseInt(st.nextToken());
		int day=Integer.parseInt(st.nextToken());
		
		System.out.println(year +" "+ month +" "+day);
		
		Calendar cal= Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);//0
		cal.set(Calendar.DATE, day);
		
		int week=cal.get(Calendar.DAY_OF_WEEK);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		// week=> 0,week=1
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다.");
	}
}
