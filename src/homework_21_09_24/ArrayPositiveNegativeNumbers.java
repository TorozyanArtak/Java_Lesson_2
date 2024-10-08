package homework_21_09_24;
//Ստանում ենք զանգվածի դրական ու բացասական թվերի հարաբերակցությունը

public class ArrayPositiveNegativeNumbers {
    public static double getRatioPosNegNumbers(int[] array) {
        int amountNegative = 0;
        int amountPositive = 0;
        for (int i:array) {
            if (i == 0) {
                continue;
            }
            if (i > 0) {
                amountPositive++;
            } else {
                amountNegative++;
            }
        }
        if (amountNegative == 0) {
            return -1;
        }
        return (double) amountPositive / amountNegative;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 8, 0, -10, -21, 80, -2, -100};
        int[] array2 = {5, 8, 15, 25, 35, 45, 5};
        System.out.println(getRatioPosNegNumbers(array1));
        System.out.println(getRatioPosNegNumbers(array2));
    }
}
