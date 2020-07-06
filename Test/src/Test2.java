import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class Test2{	
	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		InputStream in = null;
		OutputStream out = null;
		
		//바이트배열을 읽어와서 파일에 저장
		
		try {
			byte[]b = new byte[]{'1','2','4','4'};
			in = new ByteArrayInputStream(b);
			//바이트 배열을 읽어옴
			
			out=new FileOutputStream("d.txt");	
			int r=-1;
			while((r=in.read())!=-1) {
				out.write(r);
			}//d.txt에다 읽어온 바이트 배열 저장
		}catch(Exception e){}
		finally {
			out.close();
			in.close();
		}
	}
}