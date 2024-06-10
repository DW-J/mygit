
public class Restaurant {
	String name;
	String location;
	String phone;
	Person owner;
	
	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

	public Restaurant(String name, String location, String phone, Person owner) {
		super();
		this.name = name;
		this.location = location;
		this.phone = phone;
		this.owner = owner;
	}
	
	public void printInfo() {
		System.out.println(name);
		System.out.println(location);
		System.out.println(phone);
		owner.printInfo();
		
	}
}
