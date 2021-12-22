package ch11_el;

import java.text.DecimalFormat;


//EL에서 static 메소드 사용하기
public class FormatUtil {

	public static String number(long number, String pattern) {
		DecimalFormat format = new DecimalFormat();
		return format.format(number);
	}
}
