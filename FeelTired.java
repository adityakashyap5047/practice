import java.util.*;

public class FeelTired{

    public static int caculateExercises(int energy, int[] drainedEnergy){

        

        return -1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Enery: ");
        int energy = sc.nextInt();

        System.out.print("Enter the total number of Exercises: ");
        int exercise = sc.nextInt();

        int drainedEnergy[] = new int[exercise];

        for(int i = 0; i < exercise; i++) {
            System.out.print("Enter the energy drained by exercise " + (i + 1) + ": ");
            drainedEnergy[i] = sc.nextInt();
        }

        sc.close();

        int result = caculateExercises(energy, drainedEnergy);
    }
}