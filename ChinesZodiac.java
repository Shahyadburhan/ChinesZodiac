
package chineszodiac;

import java.util.Scanner;

public class ChinesZodiac {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year to check :");
        int year = input.nextInt();
        
        switch (year%12){
            case 0:System.out.println("it is Monkey year");break;
            case 1:System.out.println("It is rooster year");break;
            
            case 2 :System.out.println("It is dog year");break;
            case 3:System.out.println("It is pig year");break;
            case 4: System.out.println("It is rat year");break;
            case 5:System.out.println("It is ox year");break;
            case 6:System.out.println("It is tiger year");break;
            case 7:System.out.println("It is rabbit year");break;
            case 8:System.out.println("It is dragon year");break;
            case 9:System.out.println("It is snake year");break;
            case 10:System.out.println("It is horse year");break;
            case 11:System.out.println("It is sheepyear");break;
            
            
        }
    }
    
}
