class Multithreading{
    public static void main(String[] args) {
        Printer printer = new Printer();
        int limit = 15;

        Thread evenThread = new EvenThread(printer, limit);
        Thread oddThread  = new OddThread(printer, limit);
        evenThread.start();
        oddThread.start();
    }
}

class Printer{
    boolean isOdd = true;

    public synchronized  void oddTurn(int number){
        try {
            while(!isOdd){
                wait();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interupted: " + e);
        }
        System.out.println("Odd -> " + number);
        isOdd = false;
        notify();
    }

    public synchronized void evenTurn(int number){
        try {
            while(isOdd){
                wait();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread was interupted: " + e);
        }
        System.out.println("Even ->" + number);
        isOdd = true;
        notify();
    }
}

class OddThread extends Thread{
   private final Printer printer;
   int limit;

    public OddThread(Printer printer, int limit) {
        this.printer = printer;
        this.limit = limit;
    }

    @Override
    public void run(){
        for(int i = 1; i <= limit; i+=2){
            printer.oddTurn(i);
        }
    }
}

class EvenThread extends  Thread{
    private final Printer printer;
    int limit;

    public EvenThread(Printer printer, int limit){
        this.printer = printer;
        this.limit = limit;
    }

    @Override
    public void run(){
        for(int i = 2; i <= limit; i+=2){
            printer.evenTurn(i);
        }
    }
}



