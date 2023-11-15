
public class Queue {

    int size;
    int count;
    int priceOfPide;
    int ciro = 0;
    Node front;
    Node rear;

    public Queue(int size, int priceOfPide) {
        this.size = size;
        this.priceOfPide = priceOfPide;
    }

    public void enqueu(String name, int pide) {
        if (isFull()) {
            System.out.println("--- QUEUE IS FULL ---");
            return;
        }
        Node a = new Node(name, pide);
        if (isEmpty()) {
            front = a;
            rear = a;
        } else {
            rear.next = a;
            rear = a;
        }
        count++;
    }

    public void dequeu() {
        if (isEmpty()) {
            System.out.println("--- QUEUE IS EMPTY ---");
            return;
        } else {
            ciro += (priceOfPide*front.getPide());
            front = front.next;
        }
        count--;
    }

    public void print_queue() {
        if (isEmpty()) {
            System.out.println("--- QUEUE IS EMPTY ---");
            return;
        }else{
            Node tmp = front;
            while(tmp != null){
                System.out.print(tmp.name + "(" + tmp.pide + ")  -->  ");
                tmp = tmp.next;
            }
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return (count == 0);
    }

    public boolean isFull() {
        return (count == size);
    }
}
