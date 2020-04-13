import java.util.ArrayList;
import java.util.Scanner;

public class ClothsManager {
	ArrayList<Cloths> clothes = new ArrayList<Cloths>();
	Scanner input; // 이게 input을 scanner 변수로 선언한건지, scanner 가 아니라 딴거여도 되는지

	ClothsManager(Scanner input) {
		this.input = input;
	}
	public void addCloths() {
		Cloths cloths = new Cloths(); // 왜 이 부분에서만 new 설정을 해주나?여기서 최초 설정으로 Cloths에 넣어주기 때문?
		System.out.print("Cloths ID : ");
		cloths.id = input.nextInt();
		String enter = input.nextLine();
		System.out.print("Cloths name : ");
		cloths.name = input.nextLine();
		System.out.print("Cloths kind : ");
		cloths.kind = input.next();
		System.out.print("Cloths price : ");
		cloths.price = input.nextInt();
		clothes.add(cloths);
	}
	public void deleteCloths() {
		System.out.print("Cloths ID : ");
		int clothsId = input.nextInt();
		int index = -1;
		for (int i = 0; i<clothes.size(); i++ ) {
			if (clothes.get(i).id == clothsId) {
				index = i;
				break;
			}	
		}
		if (index >= 0) {
			clothes.remove(index);
			Cloths.numClothesRegistered--;
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
					} // if
				} // while
				break;
			} // if
		} // for
		
	}
	public void viewClothes() {
//		System.out.print("Cloths ID : ");
//		int clothsId = input.nextInt();
		System.out.println("# of registered clothes :" + Cloths.numClothesRegistered);
		for (int i = 0; i<clothes.size(); i++ ) {
			clothes.get(i).printInfo();
		}
		
	}
}
