package p0702_3;

public class GenericMyArray<T> {
	private Object[] array=new Object[10];
//제네릭을 쓰더라도 배열 생성은 Object로 시작한다.
	int i;

	public void add(T obj) {
		array[i++]=obj;
	}
	
	public T get(int index) {
		return (T)array[index];
	}
	
	public static void main(String[] args) {
		GenericMyArray<String> myArray1 = new GenericMyArray<String>();
		myArray1.add(new String("test"));
		myArray1.add(new String("test2"));
		String str=myArray1.get(1);
		System.out.println(str);
		
		GenericMyArray<Integer> myArray2 = new GenericMyArray<Integer>();
		myArray2.add(new Integer(100));
		Integer num=myArray2.get(0);
		//배열의 주소는 첫번째 인덱스의 주소값과 같다.
		//배열 하나는 주소를 4씩 차지한다.
		System.out.println(num);
	}
}
