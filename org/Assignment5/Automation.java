package Assignment5;

public class Automation extends MultipleLanguage implements testTool{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation a = new Automation();
		a.python();
		a.ruby();
		a.Selenium();
		a.java();
	}

	@Override
	public void ruby() {
		
		System.out.println("ruby language");
		
	}

	@Override
	public void java() {
		System.out.println("OOPs concept");
		
	}

	@Override
	public void Selenium() {
		System.out.println("selenium Automation");
		
	}

	
}
