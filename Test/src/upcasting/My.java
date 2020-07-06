package upcasting;
import java.util.Scanner;

public class My {
	Friend [] f;
	int num;
	
	My(int n){
		f = new Friend[n];//생성자 안에서 객체배열 생성
		num = 0;//초기화
	}
	void add(Friend fr) {
		f[num++]=fr;
	}
	void save(int select) {
		String name,phone,adr,school,major;
		
		Scanner s = new Scanner(System.in);
		System.out.println("이름: ");
		name = s.next();
		System.out.println("번호: ");
		phone = s.next();
		System.out.println("주소: ");
		adr = s.next();
		
		if(select==1) {
			System.out.println("고등학교명: ");
			school = s.next();
			add(new High(name,phone,adr,school));
			//자식은 부모의 자료형 데이터를 모두 가지고 있으므로 업캐스팅가능
		}else if(select==2) {
			System.out.println("일하는 분야: ");
			major = s.next();
			add(new Worker(name,phone,adr,major));
		}
	}
	
	void all() {
		for(int i=0;i<num;i++) {
			f[i].data();
//	      자식 > 부모가 아닌 자식 = 부모가 되었기 때문에 출력 시
//	      자식 클래스의 내용 먼저 출력된다

		}
	}
	
	void show() {
		for(int i=0;i<num;i++) {
			f[i].shows();
		}
	}
}
