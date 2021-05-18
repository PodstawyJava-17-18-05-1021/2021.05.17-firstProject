// Mateusz Bereda

public class App4 {
    public static void main(String[] args) {
        // kometarz
        int a = 3;

        if(a == 5) {
            System.out.println("Jesteśmy w ifie !!");
            int wynik = a * a;
            System.out.println(wynik);
        } else if(a == 3) {
            System.out.println("a nie jest równe 5 !! Ale jest równe 3 !!");
        } else if(a == 2) {
            System.out.println("a jest równe 2 !!");
        } else if(a < 0) {
            System.out.println("a jest mniejsze od 0 !!");
        } else {
            System.out.println("Ciężko stwierdzić czym jest a !!");
        }

        switch(a) {
            case 1:
                System.out.println("Jest jedynka !!");
            case 3:
                System.out.println("Jest trzy !!");
            case 5:
                System.out.println("Jest 5");
            default:
                System.out.println("Nie wiadomo !!");
        }

        System.out.println("Koniec programu !!");
    }
}
