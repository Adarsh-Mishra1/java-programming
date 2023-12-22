package Basics;

public class Main {
    int num;
    String name;
    public static int cls;

    //void setinfor(){

    //}
    void getinfo(){
        System.out.println(num);
        System.out.println(name);
        System.out.println(cls);
    }

    static int getclass(){
        return cls;
    }
    Main(int roll,String name,int cls){
        this.num=roll;
        this.name=name;
        Main.cls=cls;
    }

    public static boolean isPalindrome(int x) {
        int rev=x;
        int res=0,digit=0,i=0;

        while(rev!=0){
            digit=rev%10;
            res=res*10+digit;
            rev=rev/10;
            System.out.println(res);
        }
        if(res==x){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       //Main stu1=new Main(4,"Adar",12);
       System.out.println(isPalindrome(-121));
        System.out.println(10%-3);
       //stu1.getinfo();
        // System.out.println("Through Object: "+stu1.getclass());
       //System.out.println("Through Class Name"+Main.getclass());
       //System.out.println("Through without class n object: "+getclass());
    }
}
