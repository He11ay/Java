import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        startTasck();
    }
public static void startTasck () {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Выберите номер задания или 0 для выхода:");
    int choice = scanner.nextInt();
    switch (choice) {
        case 1:
           tasck1();
            break;
        case 2:
            tasck2();
            break;
        case 3:
            tasck3();
            break;
        case 4:
           tasck4();
            break;
        case 5:
            tasck5();
            break;
        case 6:
            tasck6();
            break;
        case 7:
            task7();
            break;
        case 8:
            task8();
            break;
        case 9:
            task9();
            break;
        case 10:
            task10();
            break;
        case 11:
            task11();
            break;
        case 12:
            task12();
            break;
        case 13:
            task13();
            break;
        case 14:
            task14();
            break;
        case 0:
            System.exit(0);
            break;
        default:
            System.out.println("Номер задания не найден");

    }
}
    public static void tasck1() {
        System.out.println("Начало задание 1: ");
        System.out.println("Hello World!");
    }

    public static void tasck2() {
        System.out.println("\nНачало задание 2: ");
        double maxDouble = Double.MAX_VALUE;
        double myDouble = 3.14159;
        System.out.println("Максимальное значение double: " + maxDouble);
        System.out.println("Моё дробное значение: " + myDouble);

        byte maxByte = Byte.MAX_VALUE;
        System.out.println("Максимальное значение byte: " + maxByte);
    }

    public static void tasck3() {
        System.out.println("\nНачало задание 3: ");
        int[] numbers = {10, 20, 30, 40, 50};


        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;


        int sum = numbers[0] + numbers[numbers.length / 2];
        System.out.println("Сумма первого и среднего элементов: " + sum);


        System.out.print("Массив после перестановки: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    public static void tasck4() {
        System.out.println("\nНачало задание 4: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число (x): ");
        double x = scanner.nextDouble();
        System.out.print("Введите второе число (y): ");
        double y = scanner.nextDouble();
        System.out.print("Введите третье число (z): ");
        double z = scanner.nextDouble();

        double average = (x + y + z) / 3;
        System.out.println("Среднее арифметическое: " + average);

        double halfAverage = Math.floor(average / 2);
        System.out.println("Среднее арифметическое / 2: " + halfAverage);

        if (halfAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }

        scanner.close();
    }

    public static void tasck5() {
        System.out.println("\nНачало задание 5: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;
        boolean error = false;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка: Деление на 0 !");
                    error = true;
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;
            default:
                System.out.println("Ошибка: Неверный оператор!");
                error = true;
        }

        scanner.close();

        if (!error) {
            System.out.println("Вычисления завершены успешно!");
        }

        }
    public static void tasck6 () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить:");
        System.out.println("1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 2) { // Только расстояние пока реализовано
            System.out.println("Выберите единицу измерения:");
            System.out.println("1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unitChoice = scanner.nextInt();

            System.out.print("Введите число: ");
            double quantity = scanner.nextDouble();

            double meters;
            switch (unitChoice) {
                case 1:
                    meters = quantity;
                    break;
                case 2:
                    meters = quantity * 1609.34;
                    break;
                case 3:
                    meters = quantity * 0.9144;
                    break;
                case 4:
                    meters = quantity * 0.3048;
                    break;
                default:
                    System.out.println("Неверный выбор единицы измерения.");
                    return;
            }

            // Вывод результатов
            System.out.println("Результат:");
            System.out.println("Метры: " + meters);
            System.out.println("Мили: " + meters / 1609.34);
            System.out.println("Ярды: " + meters / 0.9144);
            System.out.println("Футы: " + meters / 0.3048);
        } else {
            System.out.println("Этот тип перевода пока не реализован.");
        }

        scanner.close();
    }
    public static void task7(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int x = 10;
        int y = 20;
        int z = 30;

        boolean found = false;
        for (int value : array) {
            if (value == x || value == y || value == z) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Данные значения отсутствуют в константах");
        }
        scanner.close();
    }
    public static void task8(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: n должно быть положительным числом.");
            return;
        }

        int k = (n + 1) / 2;
        int sum = k * k;

        System.out.println("Сумма нечетных чисел от 1 до " + n + ": " + sum);
        scanner.close();
    }
    public static void task9(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        System.out.println("Введите элементы массива (дробные числа):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;
        System.out.println("Среднее арифметическое: " + average);

        System.out.print("Массив, умноженный на среднее арифметическое: ");
        for (int i = 0; i < size; i++) {
            array[i] *= average;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        scanner.close();
    }
    public static void task10(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Первая строка матрицы, умноженная на 3: ");
        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] * 3 + (j < cols - 1 ? ", " : ""));
        }
        System.out.println();

        scanner.close();
    }
    //Итоговая задача 1
    public static void task11(){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // Форматирование до 2 знаков после запятой

        System.out.print("Введите текущий курс доллара: ");
        double dollarRate = scanner.nextDouble();

        System.out.print("Введите количество рублей: ");
        double rubles = scanner.nextDouble();

        if (dollarRate <= 0 || rubles < 0) {
            System.out.println("Ошибка: Курс должен быть положительным, а количество рублей неотрицательным.");
            return;
        }

        double dollars = rubles / dollarRate;
        String formattedDollars = df.format(dollars);

        System.out.println("Итого: " + formattedDollars + " долларов");

        scanner.close();
    }
    //Итоговая задача 2
    public static void task12(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение (5 символов): ");
        String equation = scanner.next();

        if (equation.length() != 5 || equation.charAt(3) != '=') {
            System.out.println("Ошибка: Некорректный формат уравнения.");
            return;
        }

        char operator = equation.charAt(1);
        double num1 = Character.getNumericValue(equation.charAt(0));
        double num2 = Character.getNumericValue(equation.charAt(4));
        double result;

        if(Character.isDigit(equation.charAt(0)) && Character.isLetter(equation.charAt(2)) && Character.isDigit(equation.charAt(4))){
            if (operator == '+') {
                result = num2 - num1;
            } else if (operator == '-') {
                result = num1 - num2;
            } else {
                System.out.println("Ошибка: Неверный оператор.");
                return;
            }
        }else if(Character.isDigit(equation.charAt(0)) && Character.isDigit(equation.charAt(2)) && Character.isLetter(equation.charAt(4))){
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else {
                System.out.println("Ошибка: Неверный оператор.");
                return;
            }

        }else{
            System.out.println("Ошибка: Некорректный формат уравнения.");
            return;
        }

        System.out.println("Решение: " + result);
        scanner.close();
    }
    //Итоговая задача 3
    public static void task13(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите строку " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        String maxUniqueString = findMaxUniqueString(strings);
        System.out.println("Ответ: " + maxUniqueString);

        scanner.close();
    }
    //Вспомогательная функция для итоговой задачи 3
    public static String findMaxUniqueString(String[] strings) {
        String maxUniqueString = "";
        int maxUniqueChars = 0;

        for (String str : strings) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : str.toCharArray()) {
                uniqueChars.add(c);
            }
            if (uniqueChars.size() > maxUniqueChars) {
                maxUniqueChars = uniqueChars.size();
                maxUniqueString = str;
            }
        }

        return maxUniqueString;
    }
    //Итоговая задача 4
    public static void task14(){
        Scanner scanner = new Scanner(System.in);
        String answer = "Заархивированный вирус";
        boolean hintUsed = false;

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nПопытка " + i + ":");
            System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
            System.out.print("Ваш ответ: ");
            String userAnswer = scanner.nextLine().trim();


            if (i == 1 && userAnswer.equalsIgnoreCase("Подсказка")) {
                System.out.println("\nПодсказка: Это что-то, что может быть опасно, но сейчас находится в неактивном состоянии.");
                hintUsed = true;
                continue;
            } else if (i > 1 && userAnswer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна.");
                continue;
            }

            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                return;
            } else if (i < 3) {
                System.out.println("Подумай еще!");
            } else {
                System.out.println("Обидно, приходи в другой раз");
                return;
            }
        }
        scanner.close();
    }
}
