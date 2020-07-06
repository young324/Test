package soket;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(); //소켓 생성
			System.out.println("연결 요청");
			
			socket.connect
				(new InetSocketAddress("localhost",5001));
			System.out.println("연결 성공C");
			
			byte []ary = null;
			String msg = null;
			
			OutputStream os = socket.getOutputStream();
			msg="Hello Server";
			ary=msg.getBytes("UTF-8");
			os.write(ary);
			System.out.println("데이터 보내기 성공!C");
			
			InputStream Is = socket.getInputStream();
			ary = new byte[30];
			int r = Is.read(ary);
			msg = new String(ary,0,r,"UTF-8");
			System.out.println("데이터 받기 성공!C");
			
			Is.close();
			os.close();
			socket.close();
			
		}catch(Exception e) {
			
		}
	}
}