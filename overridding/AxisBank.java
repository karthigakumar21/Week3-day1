package overridding;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("amount has been deposited");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank a = new AxisBank();
		a.deposit();
		a.saving();
		a.fixed();
		
	}

}
