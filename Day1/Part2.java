import java.util.ArrayList;
import java.util.Scanner;

public class Part2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> depths = new ArrayList<>();
        int deeper = 0;
        int firstSum, secondSum;
        
        while(input.hasNextInt()){
            depths.add(input.nextInt());
        }
        for(int i = 3; i < depths.size(); i++){
            firstSum = depths.get(i-3) + depths.get(i-2) + depths.get(i-1);
            secondSum = depths.get(i-2) + depths.get(i-1) + depths.get(i);
            if(secondSum > firstSum){
                deeper++;
            }
        }
        System.out.println("Deeper: " + deeper);
    }
}