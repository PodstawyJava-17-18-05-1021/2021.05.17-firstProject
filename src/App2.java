public class App2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        double wynik;

        wynik=(double)a/(double)b;

        double aJakoDouble;
        aJakoDouble=a;

        System.out.println(wynik);
        System.out.println(aJakoDouble);

        double jakas = 4.5;
        int jakas2=(int)jakas;

        System.out.println(jakas2);

        wynik = b % a;

        System.out.println("----------------------------");
        System.out.println(wynik);


        System.out.println("----------------------------------------------");
        int i = 1;

        System.out.println(i++);
        System.out.println(++i);

        System.out.println(i--);
        System.out.println(--i);

        boolean logiczna = a >= b;

        System.out.println(logiczna);


        boolean b1 = true;
        boolean b2 = false;

        boolean wynikLogiczny = !b2;

        System.out.println("-----------");
        System.out.println(wynikLogiczny);
    }
}
