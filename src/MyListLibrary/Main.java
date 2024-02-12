package MyListLibrary;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>();
        System.out.println("First values");

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list.toString());
        System.out.println(list.sublist(1,4).toString());
        System.out.println(list.contains(20));
    }
}
