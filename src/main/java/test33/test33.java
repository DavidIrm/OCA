package test33;

import java.util.Arrays;

public class test33 {
    public static void main(String[] args) {
        int[] random = {6, -4, 12, 0, 7,  -10};
        int x = 7;
        int y = Arrays.binarySearch(random,x);
        System.out.println(y);
    }
}
