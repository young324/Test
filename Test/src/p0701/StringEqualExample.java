package p0701;

public class StringEqualExample {

	public static void main(String[] args) {
		String strVar1 = new String("��ȣ��");
		String strVar2 = "��ȣ��";
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		
		//������ ���Ǵ�
		if(strVar1==strVar2) {
			System.out.println("���� String ��ü�� ����, ���� �޸�");
		}else {
			System.out.println("�ٸ� String ��ü�� ����");
		}
		
		//���� ���Ǵ�
		if(strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü ����");
		}else
			System.out.println("�ٸ� String ��ü ����");
	}
}