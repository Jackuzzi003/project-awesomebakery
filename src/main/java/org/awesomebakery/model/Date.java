package org.awesomebakery.model;

public class Date {

	private int day;
	private int hour;

	public Date(int day, int hour) {
		this.day = day;
		this.hour = hour;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@Override
	public String toString() {
		return "<" + day + "." + hour + ">";
	}

	public Date parseStringToDate (String stringDate){
		String[] tmp = stringDate.split(".");

		int days = Integer.parseInt(tmp[1]);
		int hours = Integer.parseInt(tmp[2]);

		return new Date(days, hours);
	}

}
