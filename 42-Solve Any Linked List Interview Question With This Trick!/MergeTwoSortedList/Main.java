package MergeTwoSortedList;


public class Main {
    public static void main(String[] args) {
        // First List
        LL list1 = new LL();
        
        list1.insertFirst(1);
        list1.insertAtEnd(2);
        list1.insertAtEnd(4);

        list1.display();
        System.out.println();


        // Second List
        LL list2 = new LL();

        list2.insertFirst(1);
        list2.insertAtEnd(3);
        list2.insertAtEnd(4);

        list2.display();
        System.out.println();

        LL ansList = list1.mergeTwoListsMain(list1, list2);

        ansList.display();
        System.out.println();


        
    }
}

