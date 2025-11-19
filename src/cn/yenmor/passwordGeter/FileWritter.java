package cn.yenmor.passwordGeter;

import java.io.*;

public class FileWritter {
	
	public static void Writer(String content,File file,boolean bl) {
		//File file = new File("c://yenmor/file0");
		try {		
			   // if file doesnt exists, then create it
			   if (!file.exists()) {
			    file.createNewFile();
			   }

			   FileWriter fw = new FileWriter(file.getAbsoluteFile(),bl);
			   BufferedWriter bw = new BufferedWriter(fw);
			   bw.write(content+"  "+DateGeter.GetDate()+"\r\n");
			   bw.close();
			   fw.close();

			   //System.out.println("Done");

			  } catch (IOException e) {
			   e.printStackTrace();
			  }
			 }
	}


