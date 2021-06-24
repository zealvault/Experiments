package listeners;

public class Main {
    public static void main(String[] args) {
        Player player = new Player(() -> System.out.println("Don't do it again"));

        player.makeAFoul();
    }
}
