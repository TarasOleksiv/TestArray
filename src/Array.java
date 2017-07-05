/**
 * Created by Taras on 05.07.2017.
 */
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] a = new int[]{2, 6, 99, 7, 3, 1, 4};
        int[] c = new int[]{2, 6, 99, 7, 3, 1, 4};
        Arrays.sort(a);
        int b = Arrays.binarySearch(a, 4);
        System.out.println(b);

        System.out.println(Arrays.equals(a, c));
        Arrays.fill(c, 77);

        for(int i = 0; i < c.length; i++) {
            System.out.print(c[i] + ",");
        }

    }
}
