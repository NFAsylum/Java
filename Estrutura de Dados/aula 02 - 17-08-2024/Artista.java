public class Artista {
    static void linhaHorizontal(int t){
        for (int i = 1; i <= t; i++){
            System.out.print("-");
        }
    }

    static void linhaVertical(int t){
        System.out.println();
        for (int i = 1; i <= t; i++){
            System.out.println("/");
        }
    }
}
