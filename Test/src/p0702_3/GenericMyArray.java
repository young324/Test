package p0702_3;

public class GenericMyArray<T> {
	private Object[] array=new Object[10];
//���׸��� ������ �迭 ������ Object�� �����Ѵ�.
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
		//�迭�� �ּҴ� ù��° �ε����� �ּҰ��� ����.
		//�迭 �ϳ��� �ּҸ� 4�� �����Ѵ�.
		System.out.println(num);
	}
}
