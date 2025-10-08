class Constructors{
    String animal, owner;
    Constructors(){
        System.out.println("This is a default constructor.");
    }
    Constructors(String animal, String owner){
        this.animal = animal;
        this.owner = owner;
    }
    void Display(){
        System.out.println("Pet animal is: " + animal);
        System.out.println("Owner of that animal is: " + owner);
    }

    public static void main(String[] args){
        Constructors con = new Constructors();
        Constructors con1 = new Constructors("Dog", "Chimtu");
        con1.Display();
    }
}