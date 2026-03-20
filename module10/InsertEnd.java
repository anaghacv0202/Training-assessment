package module10;
public class InsertEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node newNode = new Node(20);

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
