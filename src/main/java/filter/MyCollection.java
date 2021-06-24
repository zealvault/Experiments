package filter;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyCollection<T> implements MyFilter{

    private ArrayList<Object> objects = new ArrayList<>();

    public void add(T o){
        this.objects.add(o);
    }


    @Override
    public ArrayList<Integer> filter(Predicate<Integer> collectionPredicate) {
        ArrayList<Integer> filteredIntegers = new ArrayList<>();

        objects.forEach(object -> {
            if(collectionPredicate.test((Integer) object)){
                filteredIntegers.add((Integer) object);
            }
        });

        return filteredIntegers;
    }
}
