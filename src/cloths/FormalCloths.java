package cloths;

import java.util.Scanner;

public class FormalCloths extends Cloths {
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
