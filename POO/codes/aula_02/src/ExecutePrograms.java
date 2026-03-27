import java.util.Scanner;

public class ExecutePrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            choice = 0;
            System.out.println("\n\nEscolha um programa para executar:\n1 - MaxOf3\n2 - ListNumbers\n3 - ListSquares\n4 - ListOdds\n5 - ListSum\n6 - ListFactorial\n7 - Bhaskara\n8 - BalancoTrimestal");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    MaxOf3.main(null);
                    break;
                case 2:
                    ListNumbers.main(null);
                    break;
                case 3:
                    ListSquares.main(null);
                    break;
                case 4:
                    ListOdds.main(null);
                    break;
                case 5:
                    ListSum.main(null);
                    break;
                case 6:
                    ListFactorial.main(null);
                    break;
                case 7:
                    Bhaskara.main(null);
                    break;
                case 8:
                    BalancoTrimestal.main(null);
                    break;
            }
        } while (choice > 0 && choice <= 8);
    }
}
