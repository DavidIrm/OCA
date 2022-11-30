package test27;

public class Main27 {

    public static void main(String[] args) {
        String s1 ="1";
        String s2 = s1.concat("2");
        System.out.println(s2);
        s2.concat("3");
        String s3 = s2.concat("3");
        System.out.println(s3);
    }
}
