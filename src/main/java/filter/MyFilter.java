package filter;

import java.util.ArrayList;
import java.util.function.Predicate;

public interface MyFilter {

    ArrayList<Integer> filter(Predicate<Integer> collectionPredicate);
}
