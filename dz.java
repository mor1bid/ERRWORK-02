import java.util.Arrays;
import java.util.Scanner;

public class dz 
{

    // 1. Реализуйте метод, который запрашивает у пользователя ввод дробного 
    // числа (типа float), и возвращает введенное значение. 
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо
    // этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.print("1. Здравствуйте! ");
        while(true) 
        {
            try 
            {
                System.out.print("Введите желаемое дробное число через запятую: ");
                String line = work.nextLine();
                Float input = Float.parseFloat(line);
                System.out.println("Вы ввели цифру " + input + "!\nюху.");
                break;
            } 
            catch (Exception e) 
            {
                System.err.println("Ошибка!");
                work.next();
            }
        }
        System.out.println("\n2.");
        errorwork_1(args);
        System.out.println("\n3.");
        errorwork_2(args);
        System.out.println("\n4. Теперь, введите своё любимое слово:");
        String line = work.nextLine();
        errorwork_3(line);
        work.close();
    }

    // 2. Если необходимо, исправьте данный код:
        // try {
            // int d = 0;
            // double catchedRes1 = intArray[8] / d;
            // System.out.println("catchedRes1 = " + catchedRes1);
        //  } catch (ArithmeticException e) {
            // System.out.println("Catching exception: " + e);
        //  }
        public static void errorwork_1(String[] args) 
        {
            int d = 0;
            try 
            {
                double catchedRes1 = 8 / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            } 
            catch (ArithmeticException e) 
            {
                System.out.println("Catching exception: " + e);
            }
        }

    // 3. Дан следующий код, исправьте его там, где требуется:
        // public static void main(String[] args) throws Exception {
        //     try {
        //         int a = 90;
        //         int b = 3;
        //         System.out.println(a / b);
        //         printSum(23, 234);
        //         int[] abc = { 1, 2 };
        //         abc[3] = 9;
        //     } catch (Throwable ex) {
        //         System.out.println("Что-то пошло не так...");
        //     } catch (NullPointerException ex) {
        //         System.out.println("Указатель не может указывать на null!");
        //     } catch (IndexOutOfBoundsException ex) {
        //         System.out.println("Массив выходит за пределы своего размера!");
        //     }
        //  }
        // public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        //     System.out.println(a + b);
        //  }
         
        public static void errorwork_2(String[] args) 
        {
            int a = 90;
            int b = 3;
            try 
            {
                System.out.println(a / b);
                printSum(23, 234);
                Integer[] abc = { 1, 2 };
                abc[1] = 9;
                System.out.println(Arrays.asList(abc));
                abc[2] = 1337;
            } 
            catch (Exception err) 
            {
                if (err instanceof NullPointerException ) 
                {
                    System.out.println("Указатель не может указывать на null!");
                }
                else if (err instanceof IndexOutOfBoundsException) 
                {
                    System.out.println("Массив выходит за пределы своего размера!");
                }
                else 
                {
                    System.out.println("Что-то пошло не так..."); } 
            }
        }
        
        public static void printSum(Integer a, Integer b) 
        {
            System.out.println(a + b);
        }
        
        // 4. Разработайте программу, которая выбросит Еxception, когда пользователь вводит пустую строку. 
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        public static void errorwork_3(String line) throws RuntimeException
        {
            if(line.isEmpty()) 
            {
                throw new RuntimeException("Пустые строки вводить нельзя. :(", null);
            }
            else 
            {
                System.out.println(line +  "! Мне всегда это так нравилось!!! ^_^");
            }
        }
}
