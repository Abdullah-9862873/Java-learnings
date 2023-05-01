/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

Input: head = [1,1,2]
Output: [1,2]
 */

package RemoveDuplicatesFromSortedList;
public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(1);
        list.insertAtEnd(2);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(3);
        list.insertAtEnd(3);

        list.display();
        System.out.println();

        list.removeDuplicatesFromSortedList();
        list.display();
        System.out.println();

    }
}
