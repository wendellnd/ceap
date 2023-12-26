public class Errado extends Thread{
	public void run(){
		Musica1 ab = new Musica1();
		try {
			ab.lberrado.grabFocus();
			ab.lberrado.setVisible(true);
			ab.btver.setVisible(false);
			Thread.sleep(2000);
			ab.lberrado.setVisible(false);
			ab.btver.setVisible(true);
		}catch(Exception ste) {
		}
	}
}