package lessons;

import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        int a = 0;
        String text = null;

        int age1 = 18;
        int age2 = 20;
        int age3 = 25;

        int[] numbers = new int[3];
        System.out.println(Arrays.toString(numbers));
        //значение по умолчанию
        // int, byte, long, short - 0
        // boolean - false
        // char - 0
        //double, float - 0.00

        //запись конкретного элемента массив
        numbers[0] = age1;
        numbers[1] = age2;
        numbers[2] = age3;

        System.out.println(Arrays.toString(numbers));
        System.out.println("Длина массива: " + numbers.length);

        //Массив массивов

        int[][] arrayArrays = new int[4][4];
        arrayArrays[0] = new int[]{1, 2, 3, 4};
        arrayArrays[1] = new int[]{1, 2, 3, 4};
        arrayArrays[2] = new int[]{1, 2, 3, 4};
        arrayArrays[3] = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(arrayArrays));

        int[] ints = {1, 2, 3, 4};
        for (int element : ints) {
            System.out.println(element);
        }
//         вывод каждого элемента
        for (int[] array : arrayArrays) {
            System.out.println(Arrays.toString(array));
            for (int numb : array)
                System.out.println(numb);
        }
        int[] numbers2 = {2, 3, 5, 6, 8};
        for (int i = 0; i < numbers2.length; i++) {
            if (i % 2 == 0){
                System.out.println( "Элемент: " + numbers2[i]);
                System.out.println( "Индекс: " + i);

            }
        }
        int waterVolume = 10;
        while (waterVolume > 0) {
            System.out.println("вытекает 1мл");
            waterVolume--;
        }
        while(true) {
            waterVolume--;
            System.out.println("вытекает 1мл");
            if (waterVolume < 0) {
                break;
            }
        }
    }
}





