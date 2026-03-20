package module10;
public class InsertBeginning {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node newNode = new Node(5);
        newNode.next = head;
        head = newNode;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}