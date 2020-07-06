package p0702_3;

public class MyArray {
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
	
	public static void main(String[] args) {
		MyArray myArray1 = new MyArray();
		myArray1.add(new String("test"));
		myArray1.add(new String("test2"));
		String str=(String)myArray1.get(1);
		System.out.println(str);
		
		MyArray myArray2 = new MyArray();
		myArray2.add(new Integer(100));
		Integer num=(Integer)myArray2.get(0);
		//배열의 주소는 첫번째 인덱스의 주소값과 같다.
		//배열 하나는 주소를 4씩 차지한다.
		System.out.println(num);
	}
}