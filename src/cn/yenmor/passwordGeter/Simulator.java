package cn.yenmor.passwordGeter;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class Simulator {
	
	public static void PressSimulator(int keyType){
		Robot robot;		
			try {
				robot = new Robot();
				robot.keyPress(keyType);
				robot.delay(50);
				robot.keyRelease(keyType);
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
				

		
		
	}

}
