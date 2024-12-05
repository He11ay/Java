import java.util.Scanner;

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
        case 0:
            System.exit(0);
            break;
        default:
            System.out.println("Номер задания не найден");

    }
    startTasck();
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
}