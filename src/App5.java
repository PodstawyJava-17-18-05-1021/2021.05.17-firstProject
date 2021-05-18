public class App5 {
    public static void main(String[] args) {
        /*for(int i = 0; i < 15; i = i + 2) {
            System.out.println("-----------------");
            System.out.println("Kod w pętli");
            System.out.println(i);
            System.out.println("-----------------");
        }*/

        int i = -5;
        while(i == -5) {
            System.out.println("Jestem w pętli while !!");
            System.out.println("-----------------");
            System.out.println("Kod w pętli");
            System.out.println(i);
            System.out.println("-----------------");
            i = i + 2;
        }

        /*do {

        } while (warunek);*/

        System.out.println("Koniec programu !!");
    }
}
