package p0702;

import java.util.StringTokenizer;

public class StTokenizer {

	public static void main(String[] args) {
		String str="Have a nice Day!";
		
		//StringTokenizer(a,b,c) >>
		//�ڸ��� ���� ���ڿ�, �ڸ��±��ع����� ����, �ڸ��� ������ ������ ����
		StringTokenizer obj =new StringTokenizer(str," ",false);
		
		//StringTokenizer,hasMoreTokens() - Token�� ����Ǿ� �ִ� �迭
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
	}

}