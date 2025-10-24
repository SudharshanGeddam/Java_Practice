public class RecursionExample {
    int print(int num)
    {
        if(num == 0){
           return 0;
        }
        System.out.print(num + "\t"); 
        return print(num-1);
    }
    public static void main(String[] args){
        int num = 10;
        RecursionExample re = new RecursionExample();
        if(num != 0)
        re.print(num);
    }
}
