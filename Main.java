import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        System.out.print("Введите число: ");
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        long num1 = Long.parseLong(consoleReader.readLine());
        System.out.println((num1 % 2 == 0) ? "Число чётное" : "Число нечётное");

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        System.out.print("Введите номер дня недели: ");
        byte day = Byte.parseByte(consoleReader.readLine());
        switch(day)
        {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }

        System.out.println("********************");
        System.out.println("Задача 3");
        System.out.println("********************");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вашу оценку: ");
        System.out.println((scanner.nextInt() >= 60) ? "Поздравляем! Вы сдали экзамен." : "Извините, вы не сдали экзамен.");
    }
}