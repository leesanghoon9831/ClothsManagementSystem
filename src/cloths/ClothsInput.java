package cloths;

import java.util.Scanner;

import exception.KindFormatException;

public interface ClothsInput {
	
	public int getId();
	
	public void setId(int id);
	
	public String getName();
	
	public void setName(String name);
	
	public String getKind();
	
	public void setKind(String kind) throws KindFormatException;
	
	public int getPrice();
	
	public void setPrice(int price);
	
	public void getClothsInput(Scanner input);
	
	public void printInfo();
	
	public void setClothsID(Scanner input);
	
	public void setClothsName(Scanner input);
	
	public void setClothsKind(Scanner input);
	
	public void setClothsPrice(Scanner input);

}
