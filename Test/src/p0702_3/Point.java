package p0702_3;

public class Point<T,V>	{
	T x; //TÅ¸ÀÔÀÇ x
	V y;
	
	Point(T x, V y){
		this.x=x;
		this.y=y;
	}
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
