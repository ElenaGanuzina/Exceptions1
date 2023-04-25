import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

 public class hw2_1 {
    public static void main(String[] args) {
        float number = getFloat();
        System.out.println("You've entered  " + number);
    }

    public static float getFloat(){
        boolean flag = true;
        float number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a float number: ");
        while(flag){
            try{
                String line = sc.nextLine();
                number = Float.parseFloat(line);
                flag = false;
                    
            } catch (NoSuchElementException | NumberFormatException e){
                System.out.println("Wrong type! Please, enter a float number ");
            } 
        }
        sc.close();
        return number; 
        
    } 
        
}
    
    

 
 