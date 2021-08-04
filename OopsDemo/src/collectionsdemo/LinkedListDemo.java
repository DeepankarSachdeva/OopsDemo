package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		  // Creating a LinkedList
        LinkedList<String> friends = new LinkedList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");

        System.out.println("Initial LinkedList : " + friends);

        // Adding an element at the specified position in the LinkedList
        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);

        // Adding an element at the beginning of the LinkedList
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);

        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

        // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);
        
        System.out.println("**Retrive Element From Linkedlist***********");
        System.out.println("First Friend in a list :"+friends.getFirst());
        System.out.println(" Last friend in list :"+friends.getLast());
        System.out.println("Search a freiend in position 3:"+friends.get(3));
        System.out.println("Delete Last friend in list :"+friends.remove("walt"));
        System.out.println(" Find the position of john in list :"+friends.indexOf("John"));
        
        System.out.println("Linked list Contents");
        
        for(String s:friends)
        {
        System.out.println(s);	
        }

	}

}
