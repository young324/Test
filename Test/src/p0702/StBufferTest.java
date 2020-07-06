package p0702;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		StringBuffer buf = new StringBuffer("Nice Day");
		
		System.out.println(buf.toString());
		System.out.println("버퍼길이: "+buf.length());
		System.out.println("버퍼용량: "+buf.capacity());
		buf.ensureCapacity(100);
		System.out.println("변경된 버퍼용량: "+buf.capacity());
		buf.insert(0, "Hi");//0번째에 Hi붙이기
		System.out.println(buf);
		buf.insert(10,"Everybody^^");
		System.out.println(buf);
		buf.insert(0, 4);
		System.out.println(buf);
	}
}