package test18;

public class Main {
    public static void main(String[] args) {
        int x = 4;
        long y = x*4 -x++;

        if(y<10)
            System.out.println("Too low");
        else System.out.println("Just right");
   //     else System.out.println("Too high");
    }
}
