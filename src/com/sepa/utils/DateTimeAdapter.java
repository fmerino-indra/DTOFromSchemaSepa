package com.sepa.utils;

import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import es.cnc.util.LocalDateUtil;

public class DateTimeAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

	@Override
	public XMLGregorianCalendar unmarshal(String v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String marshal(XMLGregorianCalendar v) throws Exception {
		Date date = null;
		Calendar c = Calendar.getInstance();
		c.set(v.getYear(), v.getMonth() - 1, v.getDay(), v.getHour(), v.getMinute(), v.getSecond());
		c.set(Calendar.MILLISECOND, 0);
		date = new Date(c.getTimeInMillis());
		return LocalDateUtil.toISOLocalDateTimeNoMillis(LocalDateUtil.dateToLocalDateTime(date));
//		return DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateUtil.dateToLocalDateTime(date));
	}

}
