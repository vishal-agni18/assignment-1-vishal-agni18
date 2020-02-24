package byLinkedList;

public class LinkedList1 {
    Person person;
    private Node first;
    private Node last;

    public void addLast(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }

    public boolean isEmpty() {

        boolean response = false;
        if (first == null) {
            response = true;
        }
        return response;
    }


}
