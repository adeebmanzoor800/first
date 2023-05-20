
class Person{
    int age;
    String name;
    public void printDetail(){
        System.out.println("persons  name is"+ name);
        System.out.println(" And persons  age is" +  age);

    }
}
public class Day1 {
    public static void main(String[] args) {
        System.out.println("creating our java class");
        Person alice=new Person();
        Person bob=new Person();
        alice.age=25;
        alice.name="alice";
        bob.age=30;
        bob.name="bob";
        alice.printDetail();
        bob.printDetail();
    }
}