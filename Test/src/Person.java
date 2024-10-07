public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    protected void talk() {
        System.out.println("Talking");
    }
}
