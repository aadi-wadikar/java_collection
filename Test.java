import surface.MyArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> a1 = new MyArrayList<>();


        for(int i = 1; i <= 10; i++){
            a1.add(i * 10);
        }

        System.out.println(a1);

        a1.addFirst(100);
        a1.addLast(10000);
        a1.add(500000, 4);

        System.out.println(a1);


        System.out.println(a1.removeFirst());
        System.out.println(a1.removeLast());

        System.out.println(a1);
    }
}
