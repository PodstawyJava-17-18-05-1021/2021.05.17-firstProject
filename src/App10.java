public class App10 {
    public static void main(String[] args) {
        int[][] tab = new int[4][4];

        for(int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = i * j;
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
