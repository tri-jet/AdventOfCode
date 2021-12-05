import java.util.Scanner;
import java.util.ArrayList;

public class Part1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    boolean hasInput = scanner.hasNextLine();
    String binaryNum, gammaRate, epsRate, bit, currentNum;
    gammaRate = epsRate = "";
    int numSize, bits0, bits1;
    ArrayList<String> binaryNums = new ArrayList<>();
    
    //Add all binary numbers to an array list
    while(hasInput){
      binaryNum = scanner.nextLine();
      if(binaryNum.length() < 3)
	break;
      numSize = binaryNum.length();
      binaryNums.add(binaryNum);
    }
    numSize = (binaryNums.get(0)).length();
    //Loop through each bit position/i.e. columns of the numbers
    for(int i = 0; i < numSize; i++){
      bits0 = bits1 = 0;
      //Loop through each number's bit position/i.e. each row of the current column.
      for(int j = 0; j < binaryNums.size(); j++){
	currentNum = binaryNums.get(j);
	bit = currentNum.substring(i, i+1);
	//Count number of 1s and 0s.
	if(bit.equals("1"))
	  bits1++;
	else bits0++;
	
      }
      //Add majority/minority bits for gamma and epsilon rate.
      if(bits1 > bits0){
	gammaRate = gammaRate + "1";
	epsRate = epsRate + "0";
      }
      if(bits0 > bits1){
	gammaRate = gammaRate + "0";
	epsRate = epsRate + "1";
      }
      System.out.println("Current bits1: " + bits1 + "   Current bits0: " + bits0);
      System.out.println("Gamma rate: " + gammaRate);
    }
    System.out.println("The gamma rate for this data is " + gammaRate);
    System.out.println("The epsilon rate for this data is " + epsRate);
  }
}