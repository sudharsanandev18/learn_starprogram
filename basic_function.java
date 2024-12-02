public class basic_function {

    public static void main(String[] args) {
        int n1 = 100;
        print_the_number(n1);
        int i = 10;
        int j = 20;
        int ans1 = add(i, j);
        int ans2 = mult(i, j);
        int ans3 = sub(i, j);
        System.out.println("added " + i + "+" + j + "=" + ans1);
        System.out.println("multiplied " + i + "*" + j + "=" + ans2);
        System.out.println("sub " + i + "-" + j + "=" + ans3);
    }

    public static void print_the_number(int nghfftytftyfytdjjtdt) {
        System.out.println("printed input :" + nghfftytftyfytdjjtdt);
    }

    public static int add(int i, int j) {
        int ans = i + j;
        return ans;
    }

    public static int mult(int i, int j) {
        int ans = i * j;
        return ans;
    }

    public static int sub(int i, int j) {
        int ans = i - j;
        return ans;
    }
}