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
			server = new ServerSocket();//�������� ����
			server.bind
				(new InetSocketAddress("localhost",5001));
		
			while(true) {
				System.out.println("���� ��ٸ�");
				Socket socket = server.accept();
				//���� ��û�� �����԰� ���ÿ� ���� �����Ѵ�.
				InetSocketAddress isa =
						(InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("���� ����");
				
				byte []ary = null;
				String msg = null;
				
				InputStream is = socket.getInputStream();
				//Ŭ���̾�Ʈ ������ ���� �޼����� �о���̴� ����
				ary = new byte[30];
				int r = is.read(ary);
				msg = new String(ary,0,r,"UTF-8");//���ڵ�
				System.out.println("������ �ޱ� ����!!S");
			
				//�����͸� ������ �۾�
				OutputStream os = socket.getOutputStream();
				msg = "Hello Client";
				ary = msg.getBytes("UTF-8");
				os.write(ary);
				
				System.out.println("������ ������S");
				
				is.close();
				os.close();
				socket.close();
			}
		}catch(Exception e) {
			
		}
	}

}
