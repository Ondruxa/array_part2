
public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int[] moneySpending = {94384, 4893, 68000, 300570, 6852};
        int monthSpending = 0;
        for (int element : moneySpending) {
            monthSpending += element;
        }
        System.out.println("Сумма трат за месяц составила " + monthSpending + " рублей.\n");
        System.out.println("task2");
        int[] weekSpending = {10000, 698, 59321, 11647, 6435};
        int maxWeekSpending = -1;
        int minWeekSpending = 2_000_000_000;
        for (int maxElement : weekSpending) {
            if (maxElement > maxWeekSpending) {
                maxWeekSpending = maxElement;
            }
        }
        for (int minElement : weekSpending) {
            if (minElement < minWeekSpending) {
                minWeekSpending = minElement;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minWeekSpending + " рублей. " +
                "Максимальная сумма трат за неделю составила " + maxWeekSpending + " рублей\n");
        System.out.println("task3");
        int[] eachWeekSpending = {97611, 84631, 4655, 100336, 33475};
        int sumSpending = 0;
        for (int elementCount : eachWeekSpending) {
            sumSpending += elementCount;
        }
        double middleEachWeekSpending = (double) sumSpending / eachWeekSpending.length;
        System.out.println("Средняя сумма трат за месяц составила " + middleEachWeekSpending + " рублей\n");
        System.out.println("task4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int elementReverseFullName = reverseFullName.length - 1; elementReverseFullName >= 0; elementReverseFullName--) {
            if (elementReverseFullName == 0) {
                System.out.println(reverseFullName[elementReverseFullName]);
                break;
            }
            System.out.print(reverseFullName[elementReverseFullName]);
        }
    }
}