import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Select the desire option.");
            System.out.println("1.- Movies");
            System.out.println("2.- Series");
            System.out.println("0.- Exiting");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 0:
                    System.out.println("Exiting. Thanks for visiting us.");
                    break;
                case 1:
                    System.out.println("MOVIES");
                    break;
                case 2:
                    System.out.println("SERIES");
                    break;
                default:
                    System.out.println("Select a valid option.");
            }
        }
        while (response != 0);
    }
}
