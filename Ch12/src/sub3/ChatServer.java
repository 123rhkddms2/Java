package sub3;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2024/01/17
 * 이름 : 김광은
 * 내용 : 채팅 프로그래밍 실습하기
 */
public class ChatServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			
			System.out.println("연결 대기...");
			socket = serverSocket.accept();
			
			System.out.println("연결 수립...");
			
			Thread t1 = new ThreadSender(socket);
			Thread t2 = new ThreadReceiver(socket);
			
			t1.start();
			t2.start();
			
			t1.join();
			t2.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		
		System.out.println("Server 종료...");
	}

}
