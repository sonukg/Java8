package lambda;

public class ThreadWithLambdaExp {
    public static void main(String[] args) {

        //Without lambda expression
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running");
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        //With lambda expression
        Runnable withLambda = () -> System.out.println("Thread is running with lambda expression");
        Thread thread1 = new Thread(withLambda);
        thread1.start();
    }
}
