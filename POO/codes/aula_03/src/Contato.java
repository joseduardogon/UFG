public class Contato {
    private String nome;
    private String email;
    private String telefone;

    public Contato(String n, String e, String t) {
        nome = n;
        email = e;
        telefone = t;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String n) {
        nome = n;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String e) {
        email = e;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String t) {
        telefone = t;
    }

    public String toString() {
        return "Contato: " + nome + " - Email: " + email + " - Tel: " + telefone;
    }
}