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


//equlas������ EqualTest.java
	@Override
	public boolean equals(Object obj) {
		//Instanceof : �����ڷν� ��üŸ�� ����ȯ�� ���������� ���θ� �Ǵ�
		if (obj instanceof Student){//obj�� Student�� ����ȯ�� �����ϳ�
			//Object�� �ֻ��� �θ��̹Ƿ� �ٿ�ĳ�������ش�
			//�ٿ�ĳ���� : �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
			Student std = (Student)obj;
			if(studentId==std.studentId)//���ϴ� �� ��ü�� ID�� ������
				return true;
			else
				return false;
		};
		return false; //Student�� ������׳� �ױ�
	}



	public static void main(String[] args) {	
		
	}
}