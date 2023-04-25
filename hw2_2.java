/*
 * Если необходимо, исправьте данный код (https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */

public class hw2_2 {
    
    public static void main(String[] args) {
        int[] intArray = {5, 17, -4, 61, 33};
        //int[] intArray = {5, 17, -4, 61, 33, 0, 8, 9, 10};
        //int[] intArray = null;
        arrayDivision(intArray);
    }

    public static void arrayDivision(int[] intArray){
    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
     } catch (NullPointerException e) {
        System.out.println("Catching exception: " + e);
     }
    }
     
}
