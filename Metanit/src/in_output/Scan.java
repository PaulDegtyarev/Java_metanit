package in_output;

import java.util.Scanner;

public class Scan{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();
        System.out.print("Введите Ваш возраст: ");
        int age = in.nextInt();
        System.out.print("Введите Ваш рост: ");
        float height = in.nextFloat();
        System.out.printf("Имя: %s\nВозраст: %d\nРост: %.2f", name, age, height);
        /*
        .nextInt() - возвращает число, введенное с клавиатуры

        .next(): считывает введенную строку до первого пробела

        .nextLine(): считывает всю введенную строку

        .nextDouble(): считывает введенное число double

        .nextBoolean(): считывает значение boolean

        .nextByte(): считывает введенное число byte

        .nextFloat(): считывает введенное число float

        .nextShort(): считывает введенное число short
        */

    }

}