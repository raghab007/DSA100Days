package Day7;

public class MultiThreading extends Thread{
    int threadNumber ;

    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    public static void main(String[] args) {
        for(int i=1;i<=3;i++){
            MultiThreading thread = new MultiThreading(i);
            thread.start();
        }   
    }

    @Override
    public void run(){
        System.out.println("Running"+this.threadNumber);
        for(int i =0;i<=3;i++){
            System.out.println("Running"+this.threadNumber+"{"+i+"}");

        }

    }
   
}
