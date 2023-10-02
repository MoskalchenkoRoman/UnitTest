package dz6;

public abstract class List {
    public static double average(java.util.List<Integer> list) {
        return list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
}
