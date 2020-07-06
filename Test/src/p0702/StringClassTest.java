package p0702;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class strClass=Class.forName("java.lang.String");
		Class personClass=Class.forName("p0702.Person");
		
		
		Constructor[] cons = strClass.getConstructors();
		for(Constructor value:cons) {
			System.out.println(value);
		}
		System.out.println();
		
		
		Method[] methods = strClass.getMethods();
		for(Method m:methods) {
			System.out.println(m);
		}
		System.out.println();
		
		Field[] fi = strClass.getFields();
		for(Field m:fi) {
			System.out.println(m);
		}
		System.out.println();

		//Person에 대한 메소드
		Method[] methods2 = personClass.getMethods();
		for(Method m:methods2) {
			System.out.println(m);
		}
		System.out.println();
		
		
	}
}