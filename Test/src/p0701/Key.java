package p0701;

public class Key {
	public int number;
	
	@Override
	public int hashCode() {
		return number;
	}
	@Override
	public boolean equals(Object obj) {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단
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
