/**
 * @author ivan.hrynchyshyn
 */
public class Foo {
    static {
        if (false) throw new NullPointerException();
    }
    public static void run(){
        System.out.println("foo");
        System.out.println("First after merge");
    }
}
