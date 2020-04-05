
public class Cloths {
	
	int id;
	String name;
	String kind;
	int price;
	
	public Cloths() {
	}
	
	public Cloths(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Cloths(int id, String name, String kind, int price) {
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.println("id : " + id + " name : " + name + " kind : " + kind + " price : " + price);
	}
	

}
