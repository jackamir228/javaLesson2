package lessons;

public class Lesson1 {
    public static void main(String[] args) {
        //булевое значение (истина/ложь)
        boolean isGoToShop = true; //1
        boolean isNotGoToShop = false; //0

        //bit - кусочек, число от 0 до 1
        //byte - 8 bit
        // 2 4 8 16 32 64 128 256
        // 1 1 1 1  1  1 1  1
        //0 - 256
        //-128 - 0 - 127
        byte ipAddressFirst = -128;


        //short - состоит из двух байтов
        //16bit
        //256 * 256
        //0 - 65535
        //-32768 - 0 32767
        short countPeopleLuxemburg = 32233;


        //int - состоит из чертырех байт
        // 32bit
        //4 294 967 296
        // -2 147 483 648 - 0 - 2 147 483 647;
        int countPeopleChina = 217345221;

        //long - состоит из 8 байт
        //64bit
        long countWorldPeople = 8_000_000_000L;

        //Числа с плавающей точкой
        //float
        //32bit
        float cola = 0.3343434221F;

        //double
        //64bit
        double atom = 0.123457765233;

        int apple = 5;
        //Сложение
        apple = apple + 1;
        //Вычитание
        apple = apple - 1;
        //Деление
        apple = 8 / 2;
        //Умножение
        apple = 4 * 2;

        //Остаток от деления
        apple = 33 % 2;
      //  System.out.println(apple);

        // Символы - char
        //16 bit
        char symbol = 100;
        char symbol2 = 'л';
//        System.out.println(symbol);

        //String
        String name = "Юрий";
        String name2 = new String("Юрий");
        //Сравнение строк
        System.out.println(name.equals(name2));

        //Методы

        //Переход в верхний регистр
        String nameLower = name.toLowerCase();
        System.out.println(nameLower);
        System.out.println(name);

        //Переход в нижний регистр
        System.out.println(name.toLowerCase());

        //поиск по строке
        boolean containsRi = name.contains("ри");
        System.out.println(containsRi);

        //Повторение строки
        String repeat = name.repeat(3);
        System.out.println(repeat);

        //Получение обрезка элементов
        String substring = name.substring(0,2);
        System.out.println(substring);

        //Получение длины строки
        int length = name.length();
        System.out.println(length);

        //обрезка пробелов
        String text = "some text     ";
        System.out.println(text.trim( ));







    }
}
