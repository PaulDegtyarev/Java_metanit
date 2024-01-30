package in_output;

public class TypePrint{

//    public static void main(String[] args){
//
//        int x = 5;
//        int y = 6;
//        System.out.println("x = " + x + " " + "y = " + y);
//        System.out.print("x = " + x + " " + "y = " + y + " ");
//        System.out.printf("x=%d; y=%d", x,y);

        /*
        %d - для вывода целочисленных значений

        %x: для вывода шестнадцатеричных чисел

        %f: для вывода чисел с плавающей точкой

        %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01

        %c: для вывода одиночного символа

        %s: для вывода строковых значений
        */



        public static void main(String[] args){

            String name = "Paul";
            int age = 18;
            float height = 1.7f;

            System.out.printf("Name: %s Age: %d Height: %.2f \n", name, age, height);

    }

}