public class test_file {

    public static void main(String[] args) {
        int n = 1;
        star(n);
    }

    public static void star(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println("*");
        }
    }
}