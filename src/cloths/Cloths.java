package cloths;

import java.util.Scanner;

import exception.KindFormatException;

public abstract class Cloths implements ClothsInput{
	
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

	public void setKind(String kind) throws KindFormatException {
		if (!kind.contains("top") && !kind.contains("pants") && !kind.contains("outer") && !kind.contains("acc")) {
			throw new KindFormatException();
		}
		this.kind = kind;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public abstract void printInfo();
	
	public void setClothsID(Scanner input) {
		System.out.print("Cloths ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setClothsName(Scanner input) {
		String enter = input.nextLine();
		System.out.print("Cloths name : ");
		String name = input.nextLine();
		this.setName(name);
	}
	public void setClothsKind(Scanner input) {
		String kind = "";
		while (!kind.contains("top") && !kind.contains("pants") && !kind.contains("outer") && !kind.contains("acc")) {
			System.out.print("Cloths kind : ");
			kind = input.next();
			try {
				this.setKind(kind);
			} catch (KindFormatException e) {
				System.out.println("Incorrect Kind Format. choose one outer, top, pants, acc");
			}
		}
	}
	public void setClothsPrice(Scanner input) {
		System.out.print("Cloths price : ");
		int price = input.nextInt();
		this.setPrice(price);
	}
	
	public String getLookString() {
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
		return slook;
	}
}
