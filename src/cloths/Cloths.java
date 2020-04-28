package cloths;

import java.util.Scanner;

public class Cloths {
	
	protected ClothsLook look = ClothsLook.Casual;
	protected int id;
	protected String name;
	protected String kind;
	protected int price;
	
	public Cloths() {

	}
	
	public Cloths(ClothsLook look) {
		this.look = look;
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
	
	public Cloths(ClothsLook look, int id, String name, String kind, int price) {
		this.look = look;
		this.id = id;
		this.name = name;
		this.kind = kind;
		this.price = price;

	}
	
	public ClothsLook getLook() {
		return look;
	}

	public void setLook(ClothsLook look) {
		this.look = look;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void printInfo() {
		String slook = "none";
		switch(this.look) {
		case Casual:
			slook = "Casual";
			break;
		case Formal:
			slook = "Formal";
			break;
		case Sportive:
			slook = "Sportive";
			break;
		case Uniform:
			slook = "Uniform";
			break;
		default:
		}
		
		System.out.println("look : " + slook + " id : " + id + " name : " + name + " kind : " + kind + " price : " + price);
	}
	
	public void getClothsInput(Scanner input) {
		System.out.print("Cloths ID : ");
		int id = input.nextInt();
		this.setId(id);
		
		String enter = input.nextLine();
		System.out.print("Cloths name : ");
		String name = input.nextLine();
		this.setName(name);
		
		System.out.print("Cloths kind : ");
		String kind = input.next();
		this.setKind(kind);
		
		System.out.print("Cloths price : ");
		int price = input.nextInt();
		this.setPrice(price);
	}

}
