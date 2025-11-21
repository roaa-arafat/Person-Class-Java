package w6;

public class person {

    private String Name;
    private int Age;

    public person() {
    }

    public person(String Name, int age) {
        this.Name = Name;
        this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.Age = age;
        } else {
            System.out.println("Invalid input");
        }

    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void talk() {
        System.out.println("Name = " + Name + " , Age = " + Age);
    }
}
