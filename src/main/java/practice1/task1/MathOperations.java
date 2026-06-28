package practice1.task1;

/*
Устраните дублирование кода,
применив перегрузку методов или использование массива аргументов.
 */

public class MathOperations {

    public int add(int... numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

}
