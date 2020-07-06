import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JFrame;

class Add implements Runnable{
	int a,b;

	@Override
	public void run() {
		int sum=0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	Add(int a, int b){
		this.a = a;
		this.b = b;
	}
}

public class Test3 extends JFrame{
	public static void main(String[] args){
		Add  t1=new  Add(1,10);

		   Thread  t = new  Thread(t1);

		   t.start();
	}
}