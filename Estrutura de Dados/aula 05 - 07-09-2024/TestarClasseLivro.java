public class TestarClasseLivro{
    public static void main(String[] args){
        Livro livroEmBranco = new Livro();
        Livro livroIncompleto = new Livro("1984", "George Orwell");
        Livro livroCompleto = new Livro("A Revolta de Atlas", "Ayn Rand", 1957, 1168, true);

        System.out.println(livroEmBranco.toString());
        System.out.println(livroIncompleto.toString());
        System.out.println(livroCompleto.toString());

        livroCompleto.devolver();
        if (livroCompleto.getEmprestado()){
            System.out.println("Este livro esta emprestado");
        }
        else{
            System.out.println("Este livro nao esta emprestado");
        }
    }
}