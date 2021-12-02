import java.util.ArrayList;
import java.util.Scanner;

public class Part1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> depths = new ArrayList<>();
        int deeper = 0;
        
        while(input.hasNextInt()){
            depths.add(input.nextInt());
        }
        for(int i = 1; i < depths.size(); i++){
            if(depths.get(i) > depths.get(i-1)){
                deeper++;
            }
        }
        System.out.println("Deeper: " + deeper);
    }
}