package cloths;

import java.util.Scanner;

public class CasualCloths extends Cloths {
	
	public CasualCloths(ClothsLook look) {
		super(look);
	}
	
	public void getClothsInput(Scanner input) {
		setClothsID(input);
		
		setClothsName(input);
		
		setClothsKind(input);
		
		setClothsPrice(input);
	}
	
	public void printInfo() {
		String slook = getLookString();
		
		System.out.println("look : " + slook + " id : " + id + " name : " + name + " kind : " + kind + " price : " + price);
	}

}
