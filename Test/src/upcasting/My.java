package upcasting;
import java.util.Scanner;

public class My {
	Friend [] f;
	int num;
	
	My(int n){
		f = new Friend[n];//������ �ȿ��� ��ü�迭 ����
		num = 0;//�ʱ�ȭ
	}
	void add(Friend fr) {
		f[num++]=fr;
	}
	void save(int select) {
		String name,phone,adr,school,major;
		
		Scanner s = new Scanner(System.in);
		System.out.println("�̸�: ");
		name = s.next();
		System.out.println("��ȣ: ");
		phone = s.next();
		System.out.println("�ּ�: ");
		adr = s.next();
		
		if(select==1) {
			System.out.println("����б���: ");
			school = s.next();
			add(new High(name,phone,adr,school));
			//�ڽ��� �θ��� �ڷ��� �����͸� ��� ������ �����Ƿ� ��ĳ���ð���
		}else if(select==2) {
			System.out.println("���ϴ� �о�: ");
			major = s.next();
			add(new Worker(name,phone,adr,major));
		}
	}
	
	void all() {
		for(int i=0;i<num;i++) {
			f[i].data();
//	      �ڽ� > �θ� �ƴ� �ڽ� = �θ� �Ǿ��� ������ ��� ��
//	      �ڽ� Ŭ������ ���� ���� ��µȴ�

		}
	}
	
	void show() {
		for(int i=0;i<num;i++) {
			f[i].shows();
		}
	}
}
