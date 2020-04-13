import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ClothsManager clothsManager = new ClothsManager(input);
		int num = -1;
		while (num != 5) {
			System.out.println("<Welcome to Closet!>");
			System.out.println("1. Add Cloths");
			System.out.println("2. Delete Cloths");
			System.out.println("3. Edit Cloths");
			System.out.println("4. View Clothes");
			System.out.println("5. Exit");
			System.out.print("Select one : ");
			num = input.nextInt();
			if (num == 1) {
				clothsManager.addCloths();
			}
			else if (num == 2) {
				clothsManager.deleteCloths();
			}
			else if (num == 3) {
				clothsManager.editCloths();
			}
			else if (num == 4) {
				clothsManager.viewClothes();
			}
			else {
				continue;
			}
		}
	}
	

}
