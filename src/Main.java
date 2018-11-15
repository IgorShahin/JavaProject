import java.util.Arrays;

public class Main {

    /**
     * Константы к заданию 1
     */
    private static final double A_CONST = 20.8;
    private static final double B_CONST = 15.3;

    public static void main(String[] args) {

        /**
         * 1. Определить две константы a и b типа Double, присвоить им любые значения.
         * Вычислить среднее значение и сохранить результат в переменную avarage.
         */
        double avarage = (A_CONST + B_CONST)/2;
        System.out.println(avarage);

        /**
         * 2. Создать класс, и задать два любых строковых значения с названиями firstName и lastName.
         * Далее необходимо вывести в консоль строку в формате "Full name: [firstName] [lastName]".
         */
        System.out.println("Full name: ["+ Name.firstName +"] {"+ Name.lastName +"]");

        /**
         * 3. Напишите программу для вывода первых 15 чисел последовательности Фибоначчи.
         */
        short fibNum = 1;
        short prevFibNum = 1;
        System.out.print(fibNum +" ");

        for(byte i = 1; i < 15; i++){
            fibNum += prevFibNum;
            prevFibNum = fibNum;

            System.out.print(fibNum +" ");
        }

        /**
         * 4. Напишите программу для сортировки массива, использующую метод пузырька.
         * Сотрировка должна происходить в отдельной функции, принимающей на вход исходный массив.
         */
        short arr[] = {12, 45, 53, 23, 84, 34, 14};
        System.out.println("\n" + Arrays.toString(bubbleSort(arr)));

        /**
         * 5. Напишите программу, решающую задачу: есть входящая строка формата "abc123", где сначала идет
         * любая последовательность букв, потом число. Необходимо получить новую строку, в конце которой будет число на
         * единицу больше предыдущего, то есть "abc124".
         */
        String str = "abc123";

        if(checkString(String.valueOf(str.charAt(str.length() - 2)))){               // Проверка предпоследнего символа на число.
            int numStr =  Character.getNumericValue(str.charAt(str.length() - 1));
            String sumNumStr = String.valueOf(numStr + 1);

            StringBuilder newStr = new StringBuilder(str);
            newStr.setCharAt(str.length()-1, sumNumStr.charAt(0));             // Изменяем последний символ.
            System.out.println(newStr);
        }else System.out.println(str);

    }

    /**
     * Метод проверяющий является ли строка символом.           | Задание 5 |
     * @param string
     * @return
     */
    public static boolean checkString(String string) {
        if (string == null) return false;
        return string.matches("^-?\\d+$");
    }

    /**
     * Метод сортировки по возрастанию.                         | Задание 4 |
     */
    private static short[] bubbleSort(short[] array){
        short changeCounter;

        do {
            changeCounter = 0;

            for(int i = 0; i < array.length -1; i++){
                if(array[i] > array[i+1]){
                    short num = array[i];
                    array[i] = array[i+1];
                    array[i+1] = num;
                    changeCounter++;
                }
            }
        }while (changeCounter > 0);

        return array;
    }

    /**
     * Класс со свойствами firstName и lastName.                 | Задание 2 |
     */
    static class Name {
        static String firstName = "Shahin";
        static String lastName = "Igor";
    }
}