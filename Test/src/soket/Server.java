package soket;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket();//서버소켓 생성
			server.bind
				(new InetSocketAddress("localhost",5001));
		
			while(true) {
				System.out.println("연결 기다림");
				Socket socket = server.accept();
				//연결 요청을 수락함과 동시에 소켓 생성한다.
				InetSocketAddress isa =
						(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("연결 성공");
				
				byte []ary = null;
				String msg = null;
				
				InputStream is = socket.getInputStream();
				//클라이언트 측에서 보낸 메세지를 읽어들이는 과정
				ary = new byte[30];
				int r = is.read(ary);
				msg = new String(ary,0,r,"UTF-8");//인코딩
				System.out.println("데이터 받기 성공!!S");
			
				//데이터를 보내는 작업
				OutputStream os = socket.getOutputStream();
				msg = "Hello Client";
				ary = msg.getBytes("UTF-8");
				os.write(ary);
				
				System.out.println("데이터 보내기S");
				
				is.close();
				os.close();
				socket.close();
			}
		}catch(Exception e) {
			
		}
	}

}
