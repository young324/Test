package p0701;

public class StringTestExample {
	public static void main(String[] args) {
		String str="";
		String str1="Hi everybody";
		String str2="Have a nice Day!";
		
		str=str1+str2;
		System.out.println(str);
		System.out.println("str1 ���� �� : "+str1.length());
		System.out.println("str1 d������ġ : "+str1.indexOf("d"));
		System.out.println("str1 ��� �ҹ��ڷ� ��ȯ : "+str1.toLowerCase());
		System.out.println("str1 ��� �빮�ڷ� ��ȯ : "+str1.toUpperCase());
		
		System.out.println("str2 ���� �� : "+str2.length());
		System.out.println("str2 a������ġ : "+str2.indexOf("a"));
		System.out.println("str2 ��� �ҹ��ڷ� ��ȯ : "+str2.toLowerCase());
		System.out.println("str2 ��� �빮�ڷ� ��ȯ : "+str2.toUpperCase());
	}
}
