abstract class AbstractClassExample{
    abstract void dog();
    abstract void cat();
}

class Animal extends  AbstractClassExample{
    @Override
    void dog(){
        System.out.println("Dogs bark at strangers.");
    }
    @Override
    void cat(){
        System.out.println("Cats are lovable animals.");
    }

    public static void main(String[] args) {
        Animal an = new Animal();
        an.dog();
        an.cat();
    }
}