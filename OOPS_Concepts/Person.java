class Person{
    String name;
    int id;
    Person(String name, int id){
        this.name = name;
        this.id = id;
    }
}

class Student extends Person{
    int age;
    Student(String name, int id, int age){
        super(name, id);
        this.age = age;
    }
}

class Employee extends Student{
    String jobRole;
    Employee(String name, int id, int age, String jobRole){
        super(name, id, age);
        this.jobRole = jobRole;
    }
    void Display(){
        System.out.println("Name of the person is: " + name);
        System.out.println("Id of the person is: " + id);
        System.out.println("Age of the person is: " + age);
        System.out.println("Person's job role is: " + jobRole);
    }

    public static void main(String[] args){
        Employee em = new Employee("Sudharshan", 24985, 21, "Software Engineer");
        em.Display();
    }
}