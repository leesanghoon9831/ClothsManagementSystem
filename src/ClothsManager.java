import java.util.ArrayList;
import java.util.Scanner;

import cloths.CasualCloths;
import cloths.Cloths;
import cloths.ClothsInput;
import cloths.ClothsLook;
import cloths.FormalCloths;
import cloths.UniformCloths;

public class ClothsManager {
	ArrayList<ClothsInput> clothes = new ArrayList<ClothsInput>();
	Scanner input;

	ClothsManager(Scanner input) {
		this.input = input;
	}
	public void addCloths() {
		int look = 0;
		ClothsInput clothsInput;
		while (look != 1 && look != 2) {
			System.out.println("1 for Casual");
			System.out.println("2 for Formal");
			System.out.println("3 for Uniform");
			System.out.print("Select num 1, 2 or 3 for cloths look : ");
			look = input.nextInt();
			if (look == 1) {
				clothsInput = new CasualCloths(ClothsLook.Casual);
				clothsInput.getClothsInput(input);
				clothes.add(clothsInput);
				break;
			}
			else if (look == 2) {
				clothsInput = new FormalCloths(ClothsLook.Formal);
				clothsInput.getClothsInput(input);
				clothes.add(clothsInput);
				break;
			}
			else if (look == 3) {
				clothsInput = new UniformCloths(ClothsLook.Uniform);
				clothsInput.getClothsInput(input);
				clothes.add(clothsInput);
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
		int index = findIndex(clothsId);
		removefromclothes(index, clothsId);
	}
	public int findIndex(int clothsId) {
		int index = -1;
		for (int i = 0; i<clothes.size(); i++ ) {
			if (clothes.get(i).getId() == clothsId) {
				index = i;
				break;
			}	
		}
		return index;
	}
	public int removefromclothes(int index, int clothsId) {
		if (index >= 0) {
			clothes.remove(index);
			System.out.println("the cloths " + clothsId + " is deleted");
			return 1;
		}
		else {
			System.out.println("the cloths has not been registered");
			return -1;
		}
	}
	
	public void editCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		for (int i = 0; i<clothes.size(); i++ ) {
			ClothsInput cloths = clothes.get(i);
			if (cloths.getId() == clothsId) {
				int num = -1;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						cloths.setClothsID(input);
						break;
					case 2:
						cloths.setClothsName(input);
						break;
					case 3:
						cloths.setClothsKind(input);
						break;
					case 4:
						cloths.setClothsPrice(input);
						break;
					default:
						continue;
					}
				} // while
				break;
			} // if
		} // for
	}
	public void viewClothes() {
		System.out.println("# of registered clothes :" + clothes.size());
		for (int i = 0; i<clothes.size(); i++ ) {
			clothes.get(i).printInfo();
		}
	}
	
	
	
	public void showEditMenu() {
		System.out.println("<Cloths Info Edit Menu>");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Kind");
		System.out.println("4. Edit Price");
		System.out.println("5. Exit");
		System.out.print("Select one : ");
	}
}
