public class Lion{
    public static void main(String [] args ){
        Dog dog = new Dog("nguyên ",3 , 5);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.kg);
        dog.eat();
        dog.listen();
    }
}
