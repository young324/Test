package p0701;

public class Circle implements Cloneable{

	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		//this.point.x=x;
		//this.point.y=y;
		point=new Point(x,y);
		this.radius=radius;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "������" + point + "�̰�, " + "��������"+radius+"�Դϴ�.";
		
	}
}
