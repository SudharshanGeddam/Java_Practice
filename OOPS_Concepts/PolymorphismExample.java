class PolymorphismExample{

    void car(String name, String model){
        System.out.println("Name of the car is: " + name);
        System.out.println("Model of the car is: " + model);
    }

    void car(int publishedYear){
        System.out.println("Published year is: " + publishedYear);
    }
}

class MethodOverriding extends PolymorphismExample{
    
    @Override
    void car(String name, String model){
        name = "FordMotors";
        model = "FordSeries1";
        System.out.println("Name of the car is: " + name);
        System.out.println("Model of the car is: " + model);
    }
    void display(){
        super.car("BMW", "BMW035");
    }

    public static void main(String[] args) {
        MethodOverriding mo = new MethodOverriding();
        mo.car("KIA", "KIA024");
        mo.car(2025);
        mo.display();
    }

}