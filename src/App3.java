public class App3 {
    public static void main(String[] args) {
        String[] imiona = new String[10];

        imiona[0] = "Mateusz";
        imiona[1] = "Janusz";
        imiona[2] = "Waldek";

        System.out.println(imiona);

        int[] liczby = new int[10];

        liczby[0] = 1;
        liczby[1] = 5;
        liczby[2] = 10;

        System.out.println(liczby[9]);

        char[] znaki = new char[10];

        System.out.println(znaki);

        String[] stringi = {"Mateusz", "Janusz", "Karol"};

        System.out.println(stringi[2]);

        String[][] twoDemetional = new String[5][5];

        twoDemetional[0][0] = "Mateusz";

        twoDemetional[4][5] = "Karol";

        int[][][] threeDementional = new int[3][3][3];

        threeDementional[1][1][1] = 5;


    }
}
