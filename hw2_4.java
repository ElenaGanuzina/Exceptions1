import java.util.Scanner;

/*
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

public class hw2_4 {
    public static void main(String[] args) {
        entryCheck();

    }

    public static void entryCheck(){
        try(Scanner sc = new Scanner(System.in);){
            System.out.println("You are welcome to enter anything you like)");
            String input = sc.nextLine();
            if(input.isEmpty()){
                throw new IllegalArgumentException ("Empty line cannot be entered");
            }else{
                System.out.println("You've entered: " + input);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
}
