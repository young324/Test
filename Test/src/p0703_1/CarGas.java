package p0703_1;

public class CarGas {
	//�ʵ�
	int gas;
	//������
	//�޼ҵ�
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		//gas�� 0�̸� gas�� �����ϴ�. ->false 
		if(gas==0) {
			System.out.println("������ �����ϴ�.");
			return true;
		}else
			return false;
	}
	void run() {
		//gas�� 0���� ũ�� �޸��ϴ� , gas������ ���
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ� ," + "���� ������ : "+gas);
				gas -=1;
			}else {
				System.out.println("����ϴ�");
				return;
			}			
		}
		
	}
}