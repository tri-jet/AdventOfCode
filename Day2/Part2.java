import java.util.Scanner;

public class Part2{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int depth, position, aim;
    depth = position = aim = 0;
    String value, command;
    boolean working = scanner.hasNextLine();
    while(working){
      command = scanner.nextLine();
      int size = command.length();
      if(size < 2){
	working = false;
	break;
      }
      switch(command.substring(0,2)){
	case "fo":
	  value = command.substring(size-1, size);
	  position += Integer.parseInt(value);
	  depth += aim * Integer.parseInt(value); 
	  break;
	case "up":
	  value = command.substring(size-1, size);
	  aim -= Integer.parseInt(value);
	  break;
	case "do":
	  value = command.substring(size-1, size);
	  aim += Integer.parseInt(value);
      }
    }
    System.out.println("Horizontal position: " + position + " Depth: " + depth);
    System.out.println("Horizontal postion x depth = " + position*depth);
  }


}