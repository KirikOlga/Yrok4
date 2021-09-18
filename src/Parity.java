import java.util.Scanner;

public class Parity {
    //задание 9 Урока 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number1 = scanner.nextInt();

        int var = number1 % 2;
        if (var == 0)
            System.out.println("Введённое число - ЧЁТНОЕ");
        else System.out.println("Введённое число  - НеЧЁТНОЕ");


    // задание 10 Урока 4

        System.out.print("Введите число от 1 до 7: ");
        int number2 = scanner.nextInt();
        switch (number2) {

            case 1:
                System.out.println("ПОНЕДЕЛЬНИК");
                break;
            case 2:
                System.out.println("ВТОРНИК");
                break;
            case 3:
                System.out.println("СРЕДА");
                break;
            case 4:
                System.out.println("ЧЕТВЕРГ");
                break;
            case 5:
                System.out.println("ПЯТНИЦА");
                break;
            case 6:
                System.out.println("СУББОТА");
                break;
            case 7:
                System.out.println("ВОСКРЕСЕНЬЕ");
                break;
            default:
            System.out.println("Ваше число не из диапазона чисел от 1 до 7.");
        }

    }
}

