package p0703_1;

public class car {
//필드
	String company = "현대자동차";
	String model;
	String color;
	
	int maxSpeed;
	
	//생성자
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