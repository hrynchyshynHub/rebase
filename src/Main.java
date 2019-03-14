import java.util.UUID;
import java.util.concurrent.CompletableFuture;


public class Main {

    public static void main(String[] args) {
        System.out.println(String.valueOf(UUID.randomUUID()));
        //run();
//
//        try{
//          throw new StackOverflowError();
//        }finally {
//            System.out.println("after");
//        }
    }


    public static void run(){
        String l;
        for (int i = 0; i < 1000; i++)
             l = new String("" + System.currentTimeMillis());

        try{
            run();
        }catch (Throwable t){
            System.out.println("catcked");
        }
        finally {
            run();
        }
    }
}

