package test17;

public class Main {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);

        for(int x : list){
            System.out.println(x + ",");
            break;
        }
    }
}
