import java.util.*;

public class FeelTired{

    public static int caculateExercises(int energy, int[] drainedEnergy){

        ArrayList <Integer> energyList = new ArrayList<>();

        for (int i = 0; i < drainedEnergy.length; i++) {
            energyList.add(drainedEnergy[i]);
            energyList.add(drainedEnergy[i]);
        }

        Collections.sort(energyList, Collections.reverseOrder());

        int exercises = 0;
        int totalEnergy = 0;

        for (int i = 0; i < energyList.size(); i++) {
            totalEnergy += energyList.get(i);
            exercises++;
            if (totalEnergy >= energy) {
                return exercises;
            }
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

        System.out.println("You feel tired after " + result + " exercises.");
    }
}