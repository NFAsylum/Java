public class Pessoa {
    private String nome;
    private int anoNascimento;
    //private Pessoa bff;
    //private Pessoa[] amigos;
    
    public Pessoa() {
    }

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        //return "nome=" + nome + ", anoNascimento=" + anoNascimento + "]";
        return nome;
    }
    
    
}
