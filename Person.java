public class Person {

    private String name;
    private int age;
    private long phoneNumber;

    public Person(String name){         //constructor taking a name parameter
        this.name=name;
    }

    public String getName() {      //getter for name
        return this.name;
    }

    public void setNumber(String name) {         //setter for name
        this.name = name;
    }

    public int age() {      //getter for age
        return this.age;
    }

    public void setAge(int age) {         //setter for age
        this.age = age;
    }

    public long getPhoneNumber() {      //getter for phone number
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {         //setter for phone number
        this.phoneNumber = phoneNumber;
    }

}
