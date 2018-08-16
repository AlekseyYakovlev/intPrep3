
public class CustomVectorList<E> {

    int counter;
    int curPos;
    Node<E> current;
    Node<E> first;
    Node<E> last;

    public CustomVectorList() {
        current = null;
        counter = curPos = 0;
        first = null;
        last = null;
    }

    public int size() {
        return counter;
    }


    public void add(E element) {
        if (counter == 0) {
            current = first = last = new Node<>(element, null, null);
        } else {
            Node<E> prev = current;
            current = new Node(element, prev.next, prev);
            if (prev.next == null) last = current;
            prev.next = current;
        }
        counter++;
        curPos++;
    }


    public E next() {
        if (current != null) {
            E element = current.element;
            current = current.next;
            return element;
        } else return null;
    }

    public boolean hasNext(){
        return current!=null;
    }

    public void goToFirst(){
        current=first;
    }


    class Node<E> {
        E element = null;
        Node<E> next = null;
        Node<E> previous = null;

        Node(E element, Node<E> next, Node<E> previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }
    }
}
