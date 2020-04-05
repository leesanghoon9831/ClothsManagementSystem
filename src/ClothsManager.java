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
			System.out.println("the cloths to be edited is " + clothsId);
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
