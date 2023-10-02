package dz6;

public class Main extends List implements Comparison{
    public static void main(String[] args) {
        Integer [] oneList = new Integer[] {6, 2, 3, 4, 5, 6};
        Integer [] twoList = new Integer[] {6, 2, 3, 4, 5, 6};
        System.out.println("Среднее значение первого списка : " + average(java.util.List.of(oneList)));
        System.out.println("Среднее значение второго списка : " + average(java.util.List.of(twoList)));
        double averagelist1 = average(java.util.List.of(oneList));
        double averagelist2 = average(java.util.List.of(twoList));

        Comparison.comparison(averagelist1, averagelist2);
    }
}
