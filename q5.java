import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class q5 {
    public static void main(String[] args) {

        Consumer<Integer> con = (value) -> System.out.println(value);
        con.accept(10);



        Supplier<Integer> sup = () -> 10;
        System.out.println(sup.get());


        Predicate pred = (value) -> value != null;
        System.out.println(pred.test(3));
        System.out.println(Arrays.asList(1,2).stream().filter(pred).count());

        Function<Integer,String> f = value -> "Shivam";
        System.out.println(f.apply(10));

    }
}
