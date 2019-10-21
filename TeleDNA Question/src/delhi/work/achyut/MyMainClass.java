package delhi.work.achyut;

import java.util.*;

public class MyMainClass {
	
	static ArrayList<CategoryInfo> listOfCategories = new ArrayList<CategoryInfo>();
	static ArrayList<SubscriberInfo> listOfSubscribers = new ArrayList<SubscriberInfo>();
	static String[] bitToCatArray = new String[32];
	
	static void display(String id) {
		String[] cat = null;
		for(SubscriberInfo i:listOfSubscribers) {
			if(i.getId() == id) {
				cat = i.getOptCat(bitToCatArray);
				break;
			}
		}
		for(int j = 0; j<cat.length;j++) {
			for(CategoryInfo i:listOfCategories) {
				if(i.getId() == cat[j])System.out.println(i.getDesc());
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("<---------Main Menu-------->");
		System.out.println("* Input Categories-->");
		int i = 0;
		Scanner scan = new Scanner(System.in);
		char ch = 'y';		
		while(ch == 'y'){
			
			CategoryInfo myCategory = new CategoryInfo();
			System.out.print("Enter ID: ");
			myCategory.setId(scan.nextLine());
			bitToCatArray[i++] = myCategory.getId();
			
			System.out.print("Enter description: ");
			myCategory.setDesc(scan.nextLine());
			
			System.out.print("Enter data: ");
			myCategory.setData(scan.nextLine());
			
			System.out.print("Sub Categories?(y/n): ");
			ch = scan.nextLine().charAt(0);
			
			while(ch == 'y'){
				SubCategoryInfo mySubCategory = new SubCategoryInfo();
				System.out.print("Enter ID: ");
				mySubCategory.setId(scan.nextLine());
				bitToCatArray[i++] = myCategory.getId();
				
				System.out.print("Enter description: ");
				mySubCategory.setDesc(scan.nextLine());
				
				System.out.print("Enter data: ");
				mySubCategory.setData(scan.nextLine());
				
				myCategory.setSubCategory(mySubCategory);
				
				System.out.print("Sub Categories?(y/n): ");
				ch = scan.nextLine().charAt(0);
			}
			
			System.out.print("More Categories?(y/n): ");
			ch = scan.nextLine().charAt(0);
			
			listOfCategories.add(myCategory);

		}
		
		//Creating Subscriber Info
		
		System.out.println("* Input Subscribers Info-->");
		ch = 'y';
		
		while(ch == 'y'){		
			SubscriberInfo mySubscriber = new SubscriberInfo();
			System.out.print("Enter User ID: ");
			mySubscriber.setId(scan.nextLine());
			
			System.out.print("Enter Opted Categories: ");
			String temp = (scan.nextLine());
			String[] temp1 = temp.split(",");
			mySubscriber.setOptCat(temp1, bitToCatArray);
			
			System.out.print("More Subscribers?(y/n): ");
			ch = scan.nextLine().charAt(0);
			
			listOfSubscribers.add(mySubscriber);
		}
		
		//searching
		System.out.print("Enter UserId to search: ");
		String id = scan.nextLine();
		display(id);
		
		scan.close();
	}
}
