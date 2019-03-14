import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author ivan.hrynchyshyn
 */
public class JavaXollections {
    public static void main(String[] args) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        listA = Stream.of(1,2,3,4,5, 8).collect(Collectors.toList());
        listB = Stream.of(4,5, 6,7,8,9,10).collect(Collectors.toList());

//        listA.retainAll(listB);

        List<Integer> insertion = new ArrayList<>(listA);
        insertion.retainAll(listB);

        List<Integer> result = new ArrayList<>(listA);
        result.addAll(listB);
        result.removeAll(insertion);

        System.out.println(result);
    }


}
