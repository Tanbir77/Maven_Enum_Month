package naztech.io.MavenEnumProject;

import java.time.Year;

public enum Month {

	JANUARY(1, 31), FEBRUARY(2, 38), MARCH(3, 31), APRIL(4, 30), MAY(5, 31), JUNE(6, 30), JULY(7, 31), AUGUST(8, 31),
	SEPTEMBER(9, 30), OCTOBER(10, 31), NOVEMBER(11, 30), DECEMBER(12, 31);

	private int monthNumber;
	private int daysInMonth;

	private Month(int monthNumber, int daysInMonth) {
		this.monthNumber = monthNumber;
		this.daysInMonth = daysInMonth;
	}

	public int getMonthNumber() {
		return this.monthNumber;
	}

	public int daysInMonth() {
		return this != FEBRUARY ? this.daysInMonth : (!Year.isLeap(Year.now().getValue())) ? this.daysInMonth : 29;
	}

	public String getShortName() {
		return this.toString().substring(0, 2);
	}

	public static Month parse(String str) {
		if (str == null || str.isEmpty())
			return null;

		str = str.toUpperCase();

		try {
			return valueOf(str);
		} catch (IllegalArgumentException e) {

			for (Month month : values()) {
				if (str.contentEquals(month.toString().substring(0, 3)))
					return month;
			}

		}

		return null;
	}

}
