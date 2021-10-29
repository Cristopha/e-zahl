public class ezahl {
    public static void main(String[] args) {
        System.out.println("moijn");
        double a = euler(1000);
        System.out.print(a);

    }
    public static double euler(double max) {
        double e = 0;
        while(max >= 0){
            e +=(1/factorial(max));
            max--;
        }
        return e;
    }

    public static double factorial(double n){
        if(n <= 1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
