package objects;

public class Example {
    private String name;
    private double id;
    private double age;

    public Example(String name, double id, double age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Example() {
        this("", 0, 0);
    }

    public String getName() {
        return this.name;
    }

    public double getId() {
        return this.id;
    }

    public double getAge() {
        return this.age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setId(double newId) {
        this.id = newId;
    }

    public void setAge(double newAge) {
        this.age = newAge;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, ID: %f, Age: %f%n", getName(),
                getId(), getAge());
    }
}
