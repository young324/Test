package upcasting;
class Friend {  //�⺻���� ����
	String name;  //�ʵ尪
	String phone;
	String adr;
	Friend(String n,String p, String a){ //������
		name=n; phone=p; adr=a;
	}
	void data() { //�Լ�
		System.out.println("�̸�"+ name);
		System.out.println("����ȣ"+ phone);
		System.out.println("�ּ�"+ adr);
	}
	void shows() {
		System.out.println("�̸�"+ name);
		System.out.println("����ȣ"+ phone);
	}
}
class High extends Friend{ //1.���ģ�� ���� ����
	String school;
	High(String n,String p, String a, String s){
		super(n,p,a);
		school=s;
	}
	void data() {   //�������̵�
		super.data(); //�θ�Ŭ�������ִ� data()ȣ��
		System.out.println("����б��� "+ school);
	}
	void shows() {
		System.out.println("�̸� "+ name);
		System.out.println("����ȣ "+ phone);
	}
}
class Worker extends Friend{
	String major; //�� �о�
	Worker(String n,String p, String a, String m){
		super(n,p,a);
		major=m;
	}
	void data() {
		super.data();
		System.out.println("���ϴ� �о�"+ major);
	}
	void shows() {
		System.out.println("�̸�"+ name);
		System.out.println("����ȣ"+ phone);

	}
}