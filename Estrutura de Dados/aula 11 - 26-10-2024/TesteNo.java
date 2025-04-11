public class TesteNo {
    public static void main(String[] args) {
        NoDuplo no1 = new NoDuplo(10);
        NoDuplo no2 = new NoDuplo(20);

        System.out.println("no1: " + no1);
        System.out.println("no2: " + no2);

        NoDuplo no3 = new NoDuplo(10);

        if (no1 == no3){System.out.println("iguais");}
        else {System.out.println("diferentes");}

        no2 = no3;
        no1.setProximo(no2);
        no2.setAnterior(no1);
        System.out.println(no1.getProximo().getInfo());
    }
}