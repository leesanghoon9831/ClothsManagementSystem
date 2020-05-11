package cloths;

import java.util.Scanner;

public class FormalCloths extends MannerCloths {
	
	public FormalCloths(ClothsLook look) {
		super(look);
	}
	
	public void getClothsInput(Scanner input) {
		setClothsID(input);
		
		setClothsName(input);
		
		setClothsKind(input);
		
		setClothsPricewithYN(input);
		
	}	
}
