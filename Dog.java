public  class Dog extends Animal {
    int kg;
    public Dog(String name, int age , int kg ){
        super(name ,age );
this.kg = kg ;
    }
    public void listen(){
        System.out.println(" nghe nhạc thái hoàng ");
    }
}
