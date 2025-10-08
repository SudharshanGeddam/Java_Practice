interface Vehicles{
    void start();
    void stop();
}

class Car implements Vehicles{
    public void start() {
        System.out.println("Cars can start automatically.");
    }
    public void stop(){
        System.out.println("Cars are stopped when break is applied.");
    }
}

class Bike implements Vehicles{
   public void start(){
        System.out.println("Bikes are two wheelers can not be started automatically");
    }
   public void stop(){
        System.out.println("Bikes are stopped when break is applied.");
    }
}

class Motors{
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
