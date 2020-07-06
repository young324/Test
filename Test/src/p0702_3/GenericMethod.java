package p0702_3;

public class GenericMethod {
	//Point클래스의T하고 V
	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {
		double left=((Number)p1.getX()).doubleValue();//왼쪽 T에서 받음
		double right=((Number)p2.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();

		double width=right-left;
		double heght=bottom-top;
		//좌표끼리 빼서 사각형의 실제 길이만 구한다
		
		return width*heght;
	}
	
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<Integer,Double>(0,0.0);
		Point<Integer, Double> p2 = new Point<>(10,10.0);
		
		double rect =GenericMethod.<Integer, Double>makeRectangle(p1,p2);
		System.out.println("두 점으로 만들어진 사각형의 넒이는 "+rect+"입니다.");

		
	}
}
