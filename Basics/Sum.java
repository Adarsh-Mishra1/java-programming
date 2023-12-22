package Basics;

// Java program to demonstrate working of method
// overloading in Java

public class Sum {

    public void multiply(int x, int y){
        System.out.println(x*y);
    }
    public int multiply(int x,int y,int z){
        return x*y*z;
    }
    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        s.multiply(4,5);
        System.out.println(s.multiply(4,5,6));

    }
}
