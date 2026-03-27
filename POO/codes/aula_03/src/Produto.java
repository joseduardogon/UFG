public class Produto {
    private static int cont = 0;
    private int codigo;
    private String nome;
    private String tipo;
    private int quantidade;
    private double valor;

    Produto () {
        cont++;
        this.codigo = cont;
    }

    Produto (String nome) {
        cont++;
        this.codigo = cont;
        this.nome = nome;
    }

    Produto (String nome, int quantidade) {
        cont++;
        this.codigo = cont;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    Produto (String nome, int quantidade, String tipo, double valor) {
        cont++;
        this.codigo = cont;
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    void vender(int qtde) {
        if (this.quantidade >= qtde) {
            quantidade = quantidade - qtde;
            double valorTotal = valor * qtde;
            System.out.println("Valor total da venda : " + valorTotal);
        }
        else
            System.out.println("Não tem quantidade suficiente em estoque");
    }

    void comprar (int qtde) {
        quantidade = quantidade + qtde;
    }

    void comprar (int qtde, double novoValor) {
        quantidade = quantidade + qtde;
        valor = novoValor;
    }

    String consultar() {
        return "Codigo: "+ codigo + " - Nome: " + nome + " - Tipo: " + tipo + " - Valor: " + valor + " - Qtde: " + quantidade;
    }

    void inserir (String nome, int quantidade, String tipo, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
    }

    boolean igual (Produto p1) {
        if (this.nome.equals(p1.getNome()) && this.tipo.equals(p1.getTipo()))
            return true;
        else return false;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int q) {
        this.quantidade = q;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double v) {
        this.valor = v;
    }
}