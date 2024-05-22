
public class Soldier extends Person{
	String rank;
	
	public Soldier() {
		// TODO Auto-generated constructor stub
	}

	public Soldier(String name, int age, String affiliation, String rank) {
		super(name, age, affiliation);
		this.rank = rank;
	}
	
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		super.printInfo();
		System.out.println(rank);
	}
	
	
}
