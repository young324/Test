package p0703_1;

public class car {
//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	
	int maxSpeed;
	
	//������
	car(){}
	
	car(String model){
		this.model=model;
	}
	
	car(String model,String color){
		this.model=model;
		this.color=color;
	}
	
	car(String model, String color, int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
	
	
}