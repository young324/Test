package p0701;

public class Key {
	public int number;
	
	@Override
	public int hashCode() {
		return number;
	}
	@Override
	public boolean equals(Object obj) {
		//�θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if(obj instanceof Key) {
			Key objkey = (Key)obj;
			if(number==objkey.number)
				return true;
			else 
				return false;
		}
		return false;
		
	}
	public Key(int number) {
		this.number=number;
	}
public static void main(String[] args) {
		
	}

}
