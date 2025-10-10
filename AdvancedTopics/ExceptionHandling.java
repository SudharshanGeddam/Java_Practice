class ExceptionHandling{
   public static void main(String[] args) {
    try{
        int num = 250;
        System.out.println("Dividing number by zero: " + (num/0));
    } catch(Exception e){
        System.out.println("Error Message: " + e);
    }
    finally{
        System.out.println("This block is executed irrelavent to exceptions");
    }   
   }   
}