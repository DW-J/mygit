
public class Person {
	String name;
	String gender;
	String phone;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	

	public Person(String name, String gender, String phone) {
		super();
		this.name = name;
		this.gender = gender;
		this.phone = phone;
	}




	public void printInfo(){
		System.out.println(name);
		System.out.println(gender);
		System.out.println(phone);
	}
}
