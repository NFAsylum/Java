public class TesteNossoVetor {
    public static void main(String[] args) {
        NossoVetor v1 = new NossoVetor(); // ja nasce com 10 pq o constutor que fizemos foi iniciado dessa forma
        NossoVetor v2 = new NossoVetor(100);

        System.out.println(v1.getDados()[4]);
        System.out.println("ola");

        NossoVetor v3 = NossoVetor.somaDoisVetores(v1, v2);
    }
}
