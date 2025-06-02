import java.util.*;

public class FeelTired{

    public static int caculateExercises(int energy, int[] drainedEnergy){

        int exercises = 0;

        for (int i = 0; i < drainedEnergy.length; i++) {
            if(energy - 2 * drainedEnergy[i] >= 0) {
                energy -= 2 * drainedEnergy[i];
                exercises += 2;
            } else if (energy - drainedEnergy[i] >= 0) {
                energy -= drainedEnergy[i];
                exercises++;
            } 
        }
        if (energy <= 0) {
            return exercises;
        }
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

        System.out.println(result);
    }
}