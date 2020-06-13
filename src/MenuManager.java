//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import gui.WindowFrame;
//import log.EventLogger;
//
//public class MenuManager {
//	static EventLogger logger = new EventLogger("log.txt");
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		ClothsManager clothsManager = getObject("clothsmanager.ser");
//		if (clothsManager == null) {
//			clothsManager = new ClothsManager(input);
//		}
//		else {
//			clothsManager.setScanner(input);
//		}
//		WindowFrame frame = new WindowFrame();
//		selectMenu(input, clothsManager);
//		putObject(clothsManager, "clothsmanager.ser");
//	}
//	
//	public static void selectMenu(Scanner input, ClothsManager clothsManager) {
//		int num = -1;
//		while (num != 5) {
//			try {
//				showMenu();
//				num = input.nextInt();
//				switch(num) {
//				case 1:
//					clothsManager.addCloths();
//					logger.log("add a cloths");
//					break;
//				case 2:
//					clothsManager.deleteCloths();
//					logger.log("delete a cloths");
//					break;
//				case 3:
//					clothsManager.editCloths();
//					logger.log("edit a cloths");
//					break;
//				case 4:
//					clothsManager.viewClothes();
//					logger.log("view a list of cloths");
//					break;
//				default:
//					continue;
//				}
//			}
//			catch(InputMismatchException e) {
//				System.out.println("Please put an between 1 and 5");
//				if(input.hasNext()) {
//					input.next();
//				}
//				num = -1;
//			}
//		}
//	}
//	
//	public static void showMenu() {
//		System.out.println("<Welcome to Closet!>");
//		System.out.println("1. Add Cloths");
//		System.out.println("2. Delete Cloths");
//		System.out.println("3. Edit Cloths");
//		System.out.println("4. View Clothes");
//		System.out.println("5. Exit");
//		System.out.print("Select one : ");
//	}
//	
//	public static ClothsManager getObject(String filename) {
//		ClothsManager clothsManager = null;
//		try {
//			FileInputStream file = new FileInputStream(filename);
//			ObjectInputStream in = new ObjectInputStream(file);
//			clothsManager = (ClothsManager) in.readObject();
//			in.close();
//			file.close();
//		} catch (FileNotFoundException e) {
//			return clothsManager;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return clothsManager;	
//	}
//	
//	public static void putObject(ClothsManager clothsManager, String filename) {
//		try {
//			FileOutputStream file = new FileOutputStream(filename);
//			ObjectOutputStream out = new ObjectOutputStream(file);
//			out.writeObject(clothsManager);
//			out.close();
//			file.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//}
