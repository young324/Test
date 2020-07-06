package p0701;

import java.util.Date;

public class ToStringEx0 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		
		System.out.println(obj1.toString());//자기주소
		System.out.println(obj2.toString());//현재날짜
	}
}