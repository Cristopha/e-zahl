public class ezahl {
    public static void main(String[] args) {
        System.out.println("moijn");
        int a = factorial(6);
        System.out.print(a);

    }
    public static double a {

    }

    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
