package dz3;

public class Main {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public static boolean isEven (int n) {
        if (n % 2 == 0) {
            System.out.println(true);
            return true;
        }
        else {
            System.out.println(false);
            return false;
        }
    }

    public static boolean enteringTheRange(int beginningRabge, int endRange, int desiredValue){
        if ((desiredValue >= beginningRabge && desiredValue <= endRange)) {
            System.out.println(true);
            return true;
        }
        else System.out.println(false);
        return false;
    }

//    public static void main(String[] args) {
//        enteringTheRange(25,100,25);
//        isEven(20);
//    }
}
