public class Main {
    public static void main(String [] args) {
        
        System.out.println((double) 1 / (2*3));
        System.out.println((double) Math.pow(2, (2 * 3)));
        System.out.println((double) 1.5 * Math.pow(10, -4) + 2.5 * Math.pow(10, -2));
        System.out.println((double) (3 + 4)/(5 + 6));
        
        double a = 2;
        double b = 3;
        double c = 5;
        int i = 2;
        int j = 3;
        
        System.out.println((double) a * b + c);
        System.out.println((double) a * (b + c));
        System.out.println((double) b / c * a);
        System.out.println((double) a / i / j);
        System.out.println((double) 4 / b / 4);
        System.out.println((double) 4 / (j / 4));
        System.out.println((double) 17 % (4 % b));
        
    }
    
}
