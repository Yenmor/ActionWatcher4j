package cn.yenmor.passwordGeterServer;
import java.io.IOException;
import java.net.*;
import java.io.*;
import cn.yenmor.passwordGeter.*;
public class ServerStart {

	public static void main(String[] args) throws IOException {
		String content = null;

		while(true) {
		
		byte[] bytes = new byte[4];
		int readCount = 0;
		ServerSocket ss = new ServerSocket(25560);
		Socket st = ss.accept();
		InputStream ism = st.getInputStream();
		while((readCount = ism.read(bytes))!= -1) {
			System.out.print(new String(bytes,0,readCount));
			
			content = content + new String(bytes,0,readCount);
		}
		FileWritter.Writer(content,new File("D:\\yenmor/file1.txt"),false);
		content = null;
		st.close();
		ss.close();
		}
		

	}

}
