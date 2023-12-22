package Basics;

class Animal {
    public void eat(){
        System.out.println("Eat all eatables");
    }
}

class Dog extends Animal {
    //eat() method overridden by Dog class.
    public int eat(int x){
        return x;
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.println(d.eat(5));
    }

}