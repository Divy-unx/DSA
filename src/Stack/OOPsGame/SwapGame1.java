package Stack.OOPsGame;

public class SwapGame1 {

    public static class Person{
        int age;
        String name;
        void saysHi(){
            System.out.println("Name: " + name + "[" + age + "]" );
        }
    }

    public static void swap1(Person prsn1, Person prsn2){
        prsn1 = new Person();
        int age = prsn1.age;
        prsn1.age = prsn2.age;
        prsn2.age = age;

        prsn2 = new Person();
        String name = prsn1.name;
        prsn1.name = prsn2.name;
        prsn2.name = name;
    }
    static void main() {
        Person p1 = new Person();
        p1.age = 10;
        p1.name = "A";
//        p1.saysHi();

        Person p2 = new Person();
        p2.age = 20;
        p2.name = "B";
//        p2.saysHi();

        p1.saysHi();
        p2.saysHi();

        swap1(p1,p2);

        p1.saysHi();
        p2.saysHi();

    }
}
