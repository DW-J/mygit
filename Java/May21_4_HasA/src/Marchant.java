
public class Marchant {
	String name;
	Market market;
	
	public Marchant() {
		// TODO Auto-generated constructor stub
	}

	public Marchant(String name, Market market) {
		super();
		this.name = name;
		this.market = market;
	}
	
	public void printInfo() {
		System.out.println(name);
		market.printInfo();
	}

}
