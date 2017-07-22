package com.sepa.utils;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;

import es.cnc.util.LocalDateUtil;

public class DateAdapter extends XmlAdapter<String, XMLGregorianCalendar> {

	@Override
	public XMLGregorianCalendar unmarshal(String v) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String marshal(XMLGregorianCalendar v) throws Exception {

		int year = v.getYear();
		int month = v.getMonth();
		int day = v.getDay();
		v.getTimezone();
		Date date = null;
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day);
		date = new Date(c.getTimeInMillis());
		return DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDateUtil.dateToLocalDate(date));
	}

}
