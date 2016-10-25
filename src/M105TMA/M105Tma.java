package M105TMA;
import java.util.Scanner;
public class M105Tma {
    public static void main (String[] args){
        //the program read dose from user and reads the doses of 3 experiment given to mices 
        //and it display the percentage of the bad experiments
        int M;
        //reads the dose from user
        Scanner inp = new Scanner(System.in);
            System.out.println("Please, insert the normal dose in ml: ");
            //this is the normal dose which used to compare the normal to the bad experiments
            M = inp.nextInt();
            //so we can calculate the total doses and create the variable to hold the sum of them
        int dose1 = 1, dose2 = 0,dose3 = 0;
       // String inpu = inp.nextLine(); ** failed
        //String[] dos_es = inpu.split("\\s+"); ** failed
        int totaldoses = 1;
        double average = 0, tehbadexp;
        double badexp = 0;
        int doseCount = 0;
        while (totaldoses > 0) {
System.out.println("Please, insert the set of experiments (3 integers per line, stop by 0 0 0):");
    dose1 = inp.nextInt();
    dose2 = inp.nextInt();
    dose3 = inp.nextInt();
   System.out.printf("%d %s %d %s %d \n", dose1," ", dose2," ",dose3);
   totaldoses =  dose1+dose2+dose3;
   if (totaldoses > 0)
       doseCount = 1 + doseCount;
   //average = (double) totaldoses /3;
   if (M < totaldoses)
       badexp = 1 + badexp;
           }
              tehbadexp = (badexp / doseCount) * 100; 
              System.out.printf("%s %.2f%% \n", "The percentage of bad experiments is", tehbadexp);
    }
    
}