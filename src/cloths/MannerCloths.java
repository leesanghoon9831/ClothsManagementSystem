package cloths;

import java.util.Scanner;

public abstract class MannerCloths extends Cloths {
	
	public MannerCloths(ClothsLook look) {
		super(look);
	}

	@Override
	public abstract void getClothsInput(Scanner input);

	@Override
	public void printInfo() {
		String slook = getLookString();
		System.out.println("look : " + slook + " id : " + id + " name : " + name + " kind : " + kind + " price : " + price);
	}
	
	public void setClothsPricewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you know the price of the cloths? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Cloths price : ");
				int price = input.nextInt();
				this.setPrice(price);
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

}
