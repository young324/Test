package upcasting;
import java.util.Scanner;

//���ε� (ģ����,����)���� �����ؼ� �ҷ����� ���α׷�
public class Ar {
	public static void main(String[] args) {
		My m =new My(5);

		while(true) {   //���ѷ��� ->break
			System.out.println("1.���ģ�� ���� �����ϱ�");
			System.out.println("2.���� ���� �����ϱ�");
			System.out.println("3.��� ���ε� ���� �� ���");
			System.out.println("4.�⺻������ ���");
			System.out.println("5.����");
			System.out.println("����: ");

			Scanner s=new Scanner(System.in);
			int select=s.nextInt();

			switch(select) {
			case 1:
			case 2:
				m.save(select);  //�Լ�ȣ��
				break;
			case 3:
				m.all();
				break;
			case 4:
				m.show();
				break;
			case 5:
				System.out.println("���α׷� ����");
				return;
			}
		}  
	}
}