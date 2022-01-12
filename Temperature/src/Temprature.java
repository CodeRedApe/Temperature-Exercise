import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
//Program for storing temperatures for a week
public class Temprature {
   public static void main(String[] args) {
//       create two serperate arrays for days of the week and the temperature for those days
       ArrayList<String> day = new ArrayList<String>(Arrays.asList(
               "Monday","Tuesday","Wednesday","Thurday","Friday","Saturday","Sunday"));
       ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(
               97,93,90,85,88,87,90));
//       User inputs the day of the week
       System.out.print("Input day of the week:");
       Scanner sc = new Scanner(System.in);
       String dayInput = sc.next();
//       outputs the day of week with corresponding temperature
       if(dayInput.equalsIgnoreCase("week") || dayInput.equalsIgnoreCase("Week")) {
           System.out.println("Day\t-\tDegrees");
           for(int i=0;i<day.size();i++) {
               System.out.println(day.get(i)+"\t-\t"+temp.get(i));
           }
       }
//       display both the day and temperature for given day if it is day of the week
       else {
           System.out.println("Day\t-\tDegrees");
//           Use the looping and decision constructs in combination with the arrays
           for(int i=0;i<day.size();i++) {
               if(day.get(i).equalsIgnoreCase(dayInput))
                   System.out.println(day.get(i)+"\t-\t"+temp.get(i));
           }
       }
   }
}