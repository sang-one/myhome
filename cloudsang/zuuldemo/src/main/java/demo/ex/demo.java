package demo.ex;

public interface demo {
      default  void ad(String args) {
            System.out.println("demo被new");
      }
      String eat(String args);
      void sleep(String a);
}
