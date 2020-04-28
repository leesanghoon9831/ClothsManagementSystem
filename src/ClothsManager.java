import java.util.ArrayList;
import java.util.Scanner;

import cloths.Cloths;
import cloths.ClothsLook;
import cloths.FormalCloths;
import cloths.UniformCloths;

public class ClothsManager {
	ArrayList<Cloths> clothes = new ArrayList<Cloths>();
	Scanner input;

	ClothsManager(Scanner input) {
		this.input = input;
	}
	public void addCloths() {
		int look = 0;
		Cloths cloths;
		while (look != 1 && look != 2) {
			System.out.println("1 for Casual");
			System.out.println("2 for Formal");
			System.out.println("3 for Uniform");
			System.out.print("Select num 1, 2 or 3 for cloths look : ");
			look = input.nextInt();
			if (look == 1) {
				cloths = new Cloths(ClothsLook.Casual);
				cloths.getClothsInput(input);
				clothes.add(cloths);
				break;
			}
			else if (look == 2) {
				cloths = new FormalCloths(ClothsLook.Formal);
				cloths.getClothsInput(input);
				clothes.add(cloths);
				break;
			}
			else if (look == 3) {
				cloths = new UniformCloths(ClothsLook.Uniform);
				cloths.getClothsInput(input);
				clothes.add(cloths);
				break;
			}
			else {
				System.out.print("Select num for cloths look between 1 and 2 : ");
			}
		}	
	}
	public void deleteCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		int index = -1;
		for (int i = 0; i<clothes.size(); i++ ) {
			if (clothes.get(i).getId() == clothsId) {
				index = i;
				break;
			}	
		}
		if (index >= 0) {
			clothes.remove(index);
			System.out.println("the cloths " + clothsId + " is deleted");
		}
		else {
			System.out.println("the cloths has not been registered");
			return;
		}
	}
	public void editCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		for (int i = 0; i<clothes.size(); i++ ) {
			Cloths cloths = clothes.get(i);
			if (cloths.getId() == clothsId) {
				int num = -1;
				while (num != 5) {
					System.out.println("<Cloths Info Edit Menu>");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Kind");
					System.out.println("4. Edit Price");
					System.out.println("5. Exit");
					System.out.print("Select one : ");
					num = input.nextInt();
					if (num == 1) {
						System.out.print("Cloths ID : ");
						int id = input.nextInt();
						cloths.setId(id);
					}
					else if (num == 2) {
						String enter = input.nextLine();
						System.out.print("Cloths name : ");
						String name = input.nextLine();
						cloths.setName(name);
					}
					else if (num == 3) {
						System.out.print("Cloths kind : ");
						String kind = input.next();
						cloths.setKind(kind);
					}
					else if (num == 4) {
						System.out.print("Cloths price : ");
						int price = input.nextInt();
						cloths.setPrice(price);
					}
					else {
						continue;
					} // if
				} // while
				break;
			} // if
		} // for
	}
	public void viewClothes() {
		//		System.out.print("Cloths ID : ");
		//		int clothsId = input.nextInt();
		System.out.println("# of registered clothes :" + clothes.size());
		for (int i = 0; i<clothes.size(); i++ ) {
			clothes.get(i).printInfo();
		}
	}
}
