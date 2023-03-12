package orderedlist;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {5, 14, 53, 63, 7, 44, 6, 4, 32};
        OrderedList<Integer> list = new OrderedList<>();
        for (Integer num : numbers) {
            list.add(num);
        }
        System.out.println(list);
        Integer n = 14;
        if (!list.search(n)) list.add(n);
        else list.remove(n);
        System.out.println(list);
    }

}
