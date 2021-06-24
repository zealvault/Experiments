package filter;

public class FilterDriver {

    public static void main(String[] args) {
        MyCollection<Integer> myCollection = new MyCollection<>();

        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);

        System.out.println(myCollection.filter(x -> x > 2));

    }
}
