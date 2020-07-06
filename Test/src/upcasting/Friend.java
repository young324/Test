package upcasting;
class Friend {  //기본적인 정보
	String name;  //필드값
	String phone;
	String adr;
	Friend(String n,String p, String a){ //생성자
		name=n; phone=p; adr=a;
	}
	void data() { //함수
		System.out.println("이름"+ name);
		System.out.println("폰번호"+ phone);
		System.out.println("주소"+ adr);
	}
	void shows() {
		System.out.println("이름"+ name);
		System.out.println("폰번호"+ phone);
	}
}
class High extends Friend{ //1.고딩친구 정보 저장
	String school;
	High(String n,String p, String a, String s){
		super(n,p,a);
		school=s;
	}
	void data() {   //오버라이딩
		super.data(); //부모클래스에있는 data()호출
		System.out.println("고등학교명 "+ school);
	}
	void shows() {
		System.out.println("이름 "+ name);
		System.out.println("폰번호 "+ phone);
	}
}
class Worker extends Friend{
	String major; //일 분야
	Worker(String n,String p, String a, String m){
		super(n,p,a);
		major=m;
	}
	void data() {
		super.data();
		System.out.println("일하는 분야"+ major);
	}
	void shows() {
		System.out.println("이름"+ name);
		System.out.println("폰번호"+ phone);

	}
}