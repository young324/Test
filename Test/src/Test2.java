import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Test2{	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		InputStream in = null;
		OutputStream out = null;
		
		//����Ʈ�迭�� �о�ͼ� ���Ͽ� ����
		
		try {
			byte[]b = new byte[]{'1','2','4','4'};
			in = new ByteArrayInputStream(b);
			//����Ʈ �迭�� �о��
			
			out=new FileOutputStream("d.txt");	
			int r=-1;
			while((r=in.read())!=-1) {
				out.write(r);
			}//d.txt���� �о�� ����Ʈ �迭 ����
		}catch(Exception e){}
		finally {
			out.close();
			in.close();
		}
	}
}