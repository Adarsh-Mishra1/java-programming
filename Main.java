public  class Main {
    public static void main(String[] args) {
        Sum obj=new Sum(4,5);
        obj.get();
    }
}

class Sum{
    protected int a,b;
    Sum(int x, int y){
        a=x;
        b=y;
    }
    public void get(){
        //System.out.println("a="+a+"b="+b);
        float f=123.456f;
        System.out.printf("%.2f",f);
    }
}