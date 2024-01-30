package helloapp;

public class HelloApp{

    public static void main(String[] args){

        // Здесь конкретный тип данных
//        int number, chislo;
//        number = 90;
//        chislo = 120;

//        int number = 90, chislo = -20;
//
//        int result = number + chislo;
//        int number = 20;
//        System.out.println("Hello Java 21!");
//        System.out.println("Перое число = " + number + "\nВторое число = " + chislo + "\nСумма = " + result);
//        System.out.println("Число = " + number);
//
//        number = 909;
//        System.out.println("Число = " + number);

        // Тип данных определяется вместе с тем, что занесено в переменную
        var x = 10;
        System.out.println(x);

        // Здесь можно присвоить значение только один раз. Как правило объявляется в верхнем регистре
        final int LIMIT = 5;
        System.out.println(LIMIT);

    }
}