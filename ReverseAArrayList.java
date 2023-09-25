import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAArrayList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("nawaz");
        list.add("ahmed");
        list.add("khan");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
