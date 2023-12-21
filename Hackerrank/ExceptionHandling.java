import java.util.Scanner;
class MyCalculator {
    public long power(int n,int p) throws ArithmeticException{        
            if(n==0||p==0){
                throw new ArithmeticException("a or be should not be negative");
            }
            if(n<0||p<0){
                throw new ArithmeticException("n or p should not be negative");
            }
            int res=1;
            while(p>0){
                res=res*n;
                --p;
                System.out.println("n:"+n+"p:"+p);
            }
            return (long)res;
        
    }
    
}



public class ExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}