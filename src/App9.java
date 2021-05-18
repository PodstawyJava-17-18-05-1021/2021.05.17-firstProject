import java.util.Random;

public class App9 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = new Random().nextInt(101);
        }

        for(int element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();

        // -----------------------------------------

        int suma = 0;
        for(int element : tab) {
            suma = suma + element;
        }

        double srednia = (double) suma / (double) tab.length;
        System.out.println("Srednia: " + srednia);
    }
}
