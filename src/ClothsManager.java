import java.util.Scanner;

public class ClothsManager {
	Cloths cloths;
	Scanner input;
	
	ClothsManager(Scanner input) {
		this.input = input;
	}
	public void addCloths() {
		cloths = new Cloths();
		System.out.print("Cloths ID : ");
		cloths.id = input.nextInt();
		String enter = input.nextLine();
		System.out.print("Cloths name : ");
		cloths.name = input.nextLine();
		System.out.print("Cloths kind : ");
		cloths.kind = input.next();
		System.out.print("Cloths price : ");
		cloths.price = input.nextInt();
	}
	public void deleteCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		if (cloths == null) {
			System.out.println("the cloths has not been registered");
			return;
		}
		if (cloths.id == clothsId) {
			cloths = null;
			System.out.println("the cloths is deleted");
		}
	}
	public void editCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		if (cloths.id == clothsId) {
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
					cloths.id = input.nextInt();
				}
				else if (num == 2) {
					String enter = input.nextLine();
					System.out.print("Cloths name : ");
					cloths.name = input.nextLine();
				}
				else if (num == 3) {
					System.out.print("Cloths kind : ");
					cloths.kind = input.next();
				}
				else if (num == 4) {
					System.out.print("Cloths price : ");
					cloths.price = input.nextInt();
				}
				else {
					continue;
				}
			}
		}
	}
	public void viewCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		if (cloths.id == clothsId) {
			cloths.printInfo();
		}
	}
}
