import java.util.*;
public class ArrayList_17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		list.add("White");
		list.add("Black");
		list.add("Yellow");
		list.add("Red");
		list.add("Blue");
		System.out.println("List: "+list);
		list.removeAll(list);
		System.out.println("List after remove all element: "+list);
	}  
}
