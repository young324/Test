package p0701;

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5) {
				//System.exit(i);//���α׷��� ����
				break;//for���� ����
				
			}
		}
		System.out.println("������Ʈ ����");
	}
}