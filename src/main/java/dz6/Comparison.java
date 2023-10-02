package dz6;

public interface Comparison {
    static void comparison (double averagelist1, double averagelist2){
        if (averagelist1 > averagelist2){
            System.out.println("Первый список имеет большее среднее значение");
        } else if (averagelist1 < averagelist2) {
            System.out.println("Второй список имеет большее среднее значение");
        }
        else System.out.println("Средние значения равны");
    };
}
