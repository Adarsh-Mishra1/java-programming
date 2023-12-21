import java.util.Scanner;

class HelloWorld {
   // private static int x;

    public static void main(String[] args) {
        float x,y;
        try(Scanner input =new Scanner(System.in)){
            x=input.nextFloat();
            y=input.nextFloat();
        }
        System.out.println("sum="+(x+y));
    }
}

