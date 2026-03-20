package module10;
public class DeleteNode {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int target = 20;

        if (head != null && head.data == target) {
            head = head.next;
        } else {
            Node curr = head, prev = null;
            while (curr != null && curr.data != target) {
                prev = curr;
                curr = curr.next;
            }
            if (curr != null) prev.next = curr.next;
        }

        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

