
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Queue size: ");
        int size = input.nextInt();
        System.out.print("Price of queue: ");
        int price = input.nextInt();
        Queue x = new Queue(size, price);
        
        int a = 1;
        while (a == 1) {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("1)New costumer   --   ");
            System.out.print("2)Make a sale   --   ");
            System.out.print("3)Display the queue   --   ");
            System.out.println("4)Calculate the giro");
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            switch (option) {
                case 0:
                    a = 0;
                    break;
                case 1:
                    System.out.print("name: ");
                    String name = input.next();
                    System.out.print("pide: ");
                    int pide = input.nextInt();
                    x.enqueu(name, pide);
                    break;
                case 2:
                    x.dequeu();
                    break;
                case 3:
                    x.print_queue();
                    break;
                case 4:
                    System.out.println("Giro: " + x.ciro);
                    break;
                default:
                    System.out.println("--- INVALID VALUE ---");
                    break;
            }
        }

    }
}
