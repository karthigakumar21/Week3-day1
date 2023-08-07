package overloading;

public class students {

	public void studentInfo() {
		System.out.println("student info updated");
	}
	public String studentInfo(String name,int id) {
		
		System.out.println("Student Id : "  +id);
		return name;
		
	}
	public int studentInfo(int phno,String email) {
		System.out.println("student email address:" +email);
		return phno;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		students s = new students();
		s.studentInfo();
		String val = s.studentInfo("karthiga", 124);
		System.out.println(val);
		int val1 = s.studentInfo(987654, "kartnbj21@gmail.com");
		System.out.println(val1);
		
		
		
	}

}
