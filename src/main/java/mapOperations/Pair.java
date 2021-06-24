package mapOperations;

public class Pair {
    private final Integer key;
    private final Character value;

    public Pair(Integer key, Character value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
