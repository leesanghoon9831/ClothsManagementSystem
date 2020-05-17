import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClothsManager clothsManager = new ClothsManager(input);
		
		selectMenu(input, clothsManager);
	}
	
	public static void selectMenu(Scanner input, ClothsManager clothsManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					clothsManager.addCloths();
					break;
				case 2:
					clothsManager.deleteCloths();
					break;
				case 3:
					clothsManager.editCloths();
					break;
				case 4:
					clothsManager.viewClothes();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an between 1 and 5");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("<Welcome to Closet!>");
		System.out.println("1. Add Cloths");
		System.out.println("2. Delete Cloths");
		System.out.println("3. Edit Cloths");
		System.out.println("4. View Clothes");
		System.out.println("5. Exit");
		System.out.print("Select one : ");
	}
}
