package test24;

public class Main24 {
    public static void main(String[] args) {
         int m = 9, n = 1, x = 0;
         while (m>n){
             m--;
             n += 2;
             x += m+n;
         }
        System.out.println(x);
    }
}
