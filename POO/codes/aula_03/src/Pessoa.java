public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private String telefone;

    public Pessoa(String n, int i, String s, String t) {
        nome = n;
        idade = i;
        sexo = s;
        telefone = t;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int i) {
        idade = i;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String s) {
        sexo = s;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String t) {
        telefone = t;
    }

    public String juntarDados() {
        return nome + " + " + idade + " + " + sexo + " + " + telefone;
    }
}