
public class Cloths {
	
	int id;
	String name;
	String kind;
	int price;
	static int numClothesRegistered = 0;
	
	public Cloths() {
		numClothesRegistered++;
	}
	
	public Cloths(int id, String name) {
		this.id = id;
		this.name = name;
		numClothesRegistered++;
	}
	
	public Cloths(int id, String name, String kind, int price) {
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.price = price;
		numClothesRegistered++;
	}
	
	public void printInfo() {
		System.out.println("id : " + id + " name : " + name + " kind : " + kind + " price : " + price);
	}
	

}
