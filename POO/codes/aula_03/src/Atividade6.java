import javax.swing.JOptionPane;

public class Atividade6 {

    public static void main(String[] args) {

        Produto p1 = new Produto();

        //p1.nome= JOptionPane.showInputDialog("Entre com o nome do produto: ");
        p1.setNome(JOptionPane.showInputDialog("Entre com o nome do produto: "));

        //p1.tipo = JOptionPane.showInputDialog("Entre com o tipo do produto: ");
        p1.setTipo(JOptionPane.showInputDialog("Entre com o tipo do produto: "));

        p1.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade do produto: ")));
        p1.setValor(Double.parseDouble(JOptionPane.showInputDialog("Entre com o nome do valor: ")));

        Produto p2 = new Produto();
        p2.setNome(JOptionPane.showInputDialog("Entre com o nome do produto: "));
        p2.setTipo(JOptionPane.showInputDialog("Entre com o tipo do produto: "));
        p2.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade do produto: ")));
        p2.setValor(Double.parseDouble(JOptionPane.showInputDialog("Entre com o nome do valor: ")));

        System.out.println("Produto 1 : ");
        System.out.println(p1.consultar());
        System.out.println("Produto 2 : ");
        System.out.println(p2.consultar());

        System.out.println("Vendeu 4 (Produto 1)");
        p1.vender(4);
        System.out.println(p1.consultar());

        System.out.println("Comprou 10 (Produto 1)");
        p1.comprar(10);
        System.out.println(p1.consultar());

        System.out.println("Comprou 5 (Produto 2) e alterou o valor para 20.00");
        p2.comprar(5, 20.00);
        System.out.println(p2.consultar());

        System.out.println("Verifica se são iguais");

        if (p1.igual(p2) == true) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}