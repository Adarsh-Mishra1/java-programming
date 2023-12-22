public class Emp extends Person {

    @Override
    void show(){
        System.out.println("It is employee");
    }

    public static void main(String[] args) {
        Emp t=new Emp();
        t.show();
        Person ob=new Person();
        ob.show();
    }
}
