package cloths;

import java.util.Scanner;

public class UniformCloths extends MannerCloths {
	
	protected String jobName;
	protected int jobPrice;
	
	public UniformCloths(ClothsLook look) {
		super(look);
	}
	
	
	
	public void getClothsInput(Scanner input) {
		setClothsID(input);
		
		setClothsName(input);
		
		setClothsKind(input);
		
		setClothsPricewithYN(input);
		setJobClothsPricewithYN(input);
		
	}
	
	public void setJobClothsPricewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know the price of the cloths at job? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setClothsPrice(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setPrice(0);
				break;
			}
			else {
			}
		}
	}
	
	public void printInfo() {
		String slook = getLookString();
		System.out.println("look : " + slook + " id : " + id + " name : " + name + " job name : " + name + " kind : " + kind + " price : " + price + " job price : " + price);
	}
	

}
