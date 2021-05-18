public class App7 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        /*for(int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }*/

        for(int currentElement : tab) {
            System.out.println(currentElement);
        }
    }
}
