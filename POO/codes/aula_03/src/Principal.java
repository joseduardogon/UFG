public class Principal {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Ana", 25, "F", "1111");
        Pessoa p2 = new Pessoa("Carlos", 30, "M", "2222");
        Pessoa p3 = new Pessoa("Bia", 22, "F", "3333");

        System.out.println(p1.juntarDados());
        System.out.println(p2.juntarDados());
        System.out.println(p3.juntarDados());

        Contato c1 = new Contato("Loja 1", "loja1@email.com", "0000");
        Contato c2 = new Contato("Loja 2", "loja2@email.com", "9999");

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}