package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * springmvc转换器
 * Converter<S, T> S：source源数据类型 	T：target 目标数据类型
 * <p>Title: DateConverter</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
public class DateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
//		try {
//			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			Date date = simpleDateFormat.parse(source);
//			return date;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//可解决多种格式的日期转换
		SimpleDateFormat[] sdfs = { 
				new SimpleDateFormat("yyyyMMdd"),
				new SimpleDateFormat("yyyy/MM/dd"),
				new SimpleDateFormat("yyyy,MM,dd"),
				new SimpleDateFormat("yyyy-MM-dd"),
				new SimpleDateFormat("yyyy年MM月dd日")
				};
		Date mytime = null;
		for (int i = 0; i < sdfs.length; i++) {
			try {
				mytime = sdfs[i].parse(source);
				return mytime;
			} catch (Exception e) {
				continue;
			}

		}
		return mytime;
	}

}
