package p0701;

public class Student {
	int studentId;
	String studentName;
	
	Student(int studentId, String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}


//equlas재정의 EqualTest.java
	@Override
	public boolean equals(Object obj) {
		//Instanceof : 연산자로써 객체타입 형변환이 가능한지의 여부를 판단
		if (obj instanceof Student){//obj가 Student로 형변환이 가능하냐
			//Object는 최상위 부모이므로 다운캐스팅해준다
			//다운캐스팅 : 부모클래스 객체가 자식클래스 객체로 형변환
			Student std = (Student)obj;
			if(studentId==std.studentId)//비교하는 두 객체의 ID가 같으면
				return true;
			else
				return false;
		};
		return false; //Student가 없으면그냥 죽기
	}



	public static void main(String[] args) {	
		
	}
}