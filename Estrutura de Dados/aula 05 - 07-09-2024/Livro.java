public class Livro{
    private String titulo, autor;
    private int anoPublicacao, numeroPaginas;
    private Boolean emprestado;


    Livro(String newTitulo, String newAutor, int newAnoPublicacao, int newNumeroPaginas, Boolean newEmprestado){
        titulo = newTitulo;
        autor = newAutor;
        anoPublicacao = newAnoPublicacao;
        numeroPaginas = newNumeroPaginas;
        emprestado = newEmprestado;
    }

    Livro(String newTitulo, String newAutor){
        this(newTitulo, newAutor, 0, 0, false);
    }

    Livro(){
        this("", "", 0, 0, false);
    }


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String newTitulo){
        titulo = newTitulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String newAutor){
        autor = newAutor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public void setAnoPublicacao(int newAnoPublicacao){
        anoPublicacao = newAnoPublicacao;
    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setNumeroPaginas(int newNumeroPaginas){
        numeroPaginas = newNumeroPaginas;
    }

    public Boolean getEmprestado(){
        return emprestado;
    }

    public void setEmprestado(Boolean newEmprestado){
        emprestado = newEmprestado;
    }


    public void emprestar(){
        emprestado = true;
    }

    public void devolver(){
        emprestado = false;
    }

    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAno de publicacao: " + anoPublicacao + "\nQuantidade de paginas: " + numeroPaginas + "\nEsta emprestado: " + emprestado;
    }
}

