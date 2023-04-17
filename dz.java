import java.util.Scanner;

public class dz {

    public static void main(String[] args) {
        boolean engine = true;
        Scanner work = new Scanner(System.in);
        System.out.print("Здравствуйте! ");
        while(engine) 
        {
            System.out.print("Введите желаемое дробное число через запятую: ");
            try 
            {
                Float inp = work.nextFloat();
                System.out.println("Вы ввели цифру " + inp + "!\nюху.");
                engine = false;
            } 
            catch (Exception e) 
            {
                System.out.println("Ошибка!");
                continue;
            }
        }
        work.close();
    }
}