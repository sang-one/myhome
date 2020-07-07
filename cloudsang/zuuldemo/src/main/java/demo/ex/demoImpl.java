package demo.ex;

public class demoImpl implements demo {
    @Override
    public String eat(String args) {
        System.out.println(args+"zaichi ");
        return args;
    }

    @Override
    public void sleep(String a) {
        System.out.println(a+"zaishui");
    }
}
