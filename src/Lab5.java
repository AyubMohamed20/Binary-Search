import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab5 {

    static ArrayList<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {

            menu();
            option = scanner.nextInt();
            System.out.println();

            switch (option) {
                case 1:
                    System.out.print("Please specify an Integer: ");
                    int temp = scanner.nextInt();
                    System.out.println();
                    list.add(temp);
                    Collections.sort(list);
                    break;
                case 2:
                    System.out.print("Please specify an Integer: ");
                    int value = scanner.nextInt();

                    if (binarySearch(list,value) == -1) {
                        System.out.println("Index of Integer is: Not Found\n");
                    } else {
                        System.out.println("Index of Integer is: " + binarySearch(list,value) + "\n");
                    }
                    break;
                case 3:
                    System.out.println(list.toString() + "\n");
                    break;
                case 4:
                    System.out.print("\nExiting...");
                    break;
            }

        }

        scanner.close();
    }

    public static void menu() {

        System.out.print(
                "1. Add Item \n" + "2. Search for Item \n" + "3. Display List \n" + "4. Exit \n" + "Please Enter: ");

    }

    public static int binarySearch(ArrayList<Integer> list, int value) {

        int start = 0;
        int end = list.size();

        while (start < end) {
            int midpoint = (start + end) / 2;
            if (list.get(midpoint) == value) {
                return midpoint;
            } else if (list.get(midpoint) < value) {
                start = midpoint + 1;
            } else {
                end = midpoint;
            }
        }
        return -1;
    }

}
