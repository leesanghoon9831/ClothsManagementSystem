import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while (num != 6) {
			System.out.println("<Welcome to Closet!>");
			System.out.println("1. Add Cloths");
			System.out.println("2. Delete Cloths");
			System.out.println("3. Edit Cloths");
			System.out.println("4. View Cloths");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.print("Select one : ");
			num = input.nextInt();
			if (num == 1) {
				addCloths();
			}
			else if (num == 2) {
				deleteCloths();
			}
			else if (num == 3) {
				editCloths();
			}
			else if (num == 4) {
				viewCloths();
			}
			else {
				continue;
			}
		}
	}
	public static void addCloths() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		String enter = input.nextLine();
		System.out.print("Cloths name : ");
		String clothsName = input.nextLine();
		System.out.print("Cloths kind : ");
		String clothsKind = input.next();
		System.out.print("Cloths price : ");
		int clothsPrice = input.nextInt();
	}
	public static void deleteCloths() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
	}
	public static void editCloths() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
	}
	public static void viewCloths() {
		Scanner input = new Scanner(System.in);
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
	}

}
