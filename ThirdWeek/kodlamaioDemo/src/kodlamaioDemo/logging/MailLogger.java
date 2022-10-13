package kodlamaioDemo.logging;

public class MailLogger implements Logger{

	@Override
	public void log() {
		System.out.println("Mail gonderildi ");
	}

}
