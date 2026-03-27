import java.util.Scanner;

public class BalancoTrimestal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gostaria de inputar seus próprios valores? [Y/n]");
        char respostaUser = scanner.nextLine().charAt(0);
        if (respostaUser == 'Y' || respostaUser == 'y') {
            System.out.println("Gastos de Janeiro: ");
            double gastosJaneiro = scanner.nextDouble();
            System.out.println("Gastos de Fevereiro: ");
            double gastosFevereiro = scanner.nextDouble();
            System.out.println("Gastos de Marco: ");
            double gastosMarco = scanner.nextDouble();
            double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
            double mediaMensal = gastosTrimestre / 3;
            System.out.printf("Gastos de Janeiro: %.2f\nGastos de Fevereiro: %.2f\nGastos de Marco: %.2f\n", gastosJaneiro, gastosFevereiro, gastosMarco);
            System.out.printf("Valor da média mensal = %.2f", mediaMensal);
        } else {
            int gastosJaneiro = 15000;
            int gastosFevereiro = 23000;
            int gastosMarco = 17000;
            int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
            double mediaMensal = gastosTrimestre / 3;
            System.out.printf("Gastos de Janeiro: %d\nGastos de Fevereiro: %d\nGastos de Marco: %d\n", gastosJaneiro, gastosFevereiro, gastosMarco);
            System.out.println("Valor da média mensal = " + mediaMensal);
        }
    }
}
