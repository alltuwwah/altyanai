
import java.util.Scanner;

//(Цикл while)
//Задача №1 Количество чисел в последовательности.
// С клавиатуры вводятся целые числа, пока не будет введено отрицательное число. Вывести на экран количество введенных чисел.
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int a = 0;
        int number;

        //System.out.println("Введите целые числа :");

        System.out.print("Введите число: ");
        number = scanner.nextInt();

        while (number >= 0) {
            a++;
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        }



        System.out.println("Количество введенных чисел: " + a);

}
}





