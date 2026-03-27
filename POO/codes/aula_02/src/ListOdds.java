import java.util.Scanner;
import java.util.Arrays;

public class ListOdds {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial number: ");
        int initNumber = scanner.nextInt();
        System.out.println("Enter the final number: ");
        int finalNumber = scanner.nextInt();
        if (initNumber <= finalNumber) {
            int size = finalNumber / 2;
            if (finalNumber % 2 == initNumber % 2 && initNumber != finalNumber) {
                size++;
            }
            int[] listNumbers = new int[size];
            int currentNumber = initNumber;
            int index = 0;
            do {
                if(currentNumber % 2 == 1) {
                    listNumbers[index] = currentNumber;
                    index++;
                }
                currentNumber++;
            } while (currentNumber <= finalNumber);
            System.out.println(Arrays.toString(listNumbers));
        } else {
            System.out.println("[Are you Kidding?]");
        }
    }
}
