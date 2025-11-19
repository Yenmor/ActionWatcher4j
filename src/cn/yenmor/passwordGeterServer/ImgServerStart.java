package cn.yenmor.passwordGeterServer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

import cn.yenmor.passwordGeter.DateGeter;
import cn.yenmor.passwordGeter.FileWritter;

public class ImgServerStart {

	public static void main(String[] args) throws IOException {
		

		while(true) {
		//int times = 0;
		byte[] bytes = new byte[4];
		int readCount = 0;
		ServerSocket ss = new ServerSocket(25561);
		Socket st = ss.accept();
		InputStream ism = st.getInputStream();
		FileOutputStream fos = new FileOutputStream(new File("D:\\yenmor\\img/"+DateGeter.GetDate()+".png"));
		while((readCount = ism.read(bytes))!= -1) {
			//System.out.print(new String(bytes,0,readCount));
			fos.write(bytes);			
		}				
		st.close();
		ss.close();
		fos.close();
		}
		

	}

}
