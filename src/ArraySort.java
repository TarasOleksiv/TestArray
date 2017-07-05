/**
 * Created by Taras on 05.07.2017.
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 40, -1, 4, 0, 5, -34, 8, 23, 10};
        int[] b = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
            b[i] = a[i];
        }

        System.out.println();
        sortBubble(a);
        sortMaxToEnd(b);
    }

    public static void sortBubble(int[] a) {
        System.out.println();
        System.out.println();
        System.out.println("sortBubble:");
        System.out.println("Сортування бульбашкою: порівнюєм 2 сусідні елементи і якщо треба, міняєм місцями. Рухаємось зліва направо.");

        for(int j = 0; j < a.length; j++) {
            for(int i = 1; i < a.length - j; i++) {
                int n = a[i];
                int p = a[i - 1];
                if(n < p) {
                    a[i - 1] = n;
                    a[i] = p;
                }
            }
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

    }

    public static void sortMaxToEnd(int[] a) {
        System.out.println();
        System.out.println();
        System.out.println("sortMaxToEnd:");
        System.out.println("Сортування : Вибираєм мксимальний з n і ставим в кінець.");
        System.out.println("Сортування : Вибираєм мксимальний з n-1 і ставим в кінець-1.");

        for(int j = 0; j < a.length; j++) {
            int max = a[0];
            int i_max = 0;

            for(int i = 0; i < a.length - j; i++) {
                if(a[i] > max) {
                    max = a[i];
                    i_max = i;
                }
            }

            // запихаєм максимальний елемент в кінець, а останній елемент ставим на місце знайденого максимального;
            a[i_max] = a[a.length - 1 - j];
            a[a.length - 1 - j] = max;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }

    }
}
