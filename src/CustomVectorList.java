import java.util.List;

public class CustomVectorList<E> {

    int counter;
    int curPos;
    Node<E> current;
    Node<E> first;
    Node<E> last;

    public CustomVectorList() {
        current =null;
        counter = curPos = 0;
        first = null;
        last = null;
    }

    public int size(){
        return counter;
    }


    public void add(E element) {
        if (counter == 0) {
            current = first = last = new Node<>(element,null,null);
        } else {
            current=last= new Node(element,null,current);
        }
    }




    public E next() {

        return
    }


    class Node<E> {
        E element = null;
        E next = null;
        E previous = null;

        public Node(E element, E next, E previous) {
            this.element = element;
            this.next = next;
            this.previous = previous;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public E getNext() {
            return next;
        }

        public void setNext(E next) {
            this.next = next;
        }

        public E getPrevious() {
            return previous;
        }

        public void setPrevious(E previous) {
            this.previous = previous;
        }
    }
}
