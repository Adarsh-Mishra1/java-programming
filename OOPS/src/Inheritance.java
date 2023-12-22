public class Inheritance {
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.show("doggy");
    }
}

class Animal{
    protected String name;
}

class Dog extends Animal{
    void show(String name){
        super.name="name";
        System.out.println("This is dog"+name);
    }
}
