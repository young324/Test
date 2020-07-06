package p0701;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 하여 String 값을 지정하는 HashMap객체 생성
		HashMap<Key,String>hashmap = new HashMap<Key,String>();
		
		//식별키(hashCode)에 put으로 입력
		hashmap.put(new Key(1),"홍길동");
		hashmap.put(new Key(1),"소프트웨어");
		
		
		//식별키(hashcode)를 이용하여 각 (String)을 읽어옴
		String value=hashmap.get(new Key(1));
		System.out.println(value);
	}
}
