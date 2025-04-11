public class TesteArvoreBinaria {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();
        //abb = árvore binária de busca

        arvore.insere(12);
        arvore.insere(8);
        arvore.insere(16);
        arvore.insere(4);
        arvore.insere(10);
        arvore.insere(14);
        arvore.insere(18);

        System.out.println(arvore.emOrdem());
    }
}
