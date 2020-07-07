package demo.ex;

public class Threadtest implements Runnable{
    @Override
    public void run() {
    int anInt=10;
        System.out.println(anInt);
    }

    public static void main(String[] args) {
        Threadtest threadtest = new Threadtest();
        Thread thread = new Thread(threadtest);
        thread.setName("named");
        thread.start();
        System.out.println(thread.getName());

    }

}
