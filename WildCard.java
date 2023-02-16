//START program
//CREATE a while loop to loop the entire program
	//CONSTRUCT variables
	//ASK user to enter the first string
	//COLLECT and store the first string
	//CONSTRUCT a string array
	//BUILD a for loop to copy individual characters in the first string to the string array named blankArray
	//ASK user to enter the replacement string
	//COLLECT and store the replacement string
	//IF there's no "*" in the index, then output "Error: no *" and end the loop
	//ELSE proceed the program
		//BUILD a nested for loop to find out if there are any illegal characters in the blankArray
			//IF each individual element matches the elements contained in the string array named list, then increase counter value by 1
		//IF the counter value equals to the length of the input, create a for loop to see user input contains more than just 1 "*"
			//IF the individual array in blankArray contains "*", then print out the replacement string instead of the "*" symbol 
			//ELSE continue to print out the characters in blankArray
		//ELSE the program prints out "Error: Incorrect characters"
	//ASK user whether they want to try the program again
	//COLLECT and store user input
		//IF the answer is "yes", then repeat the loop
		//ELSE end the program

import java.util.*;

public class WildCard{

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		int loop = 0;
		
		while(loop == 0){
			
			//Construct variables
			String[] list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","*"};
			List list2 = Arrays.asList(list);
			String first;
			String replacement;
			int firstHalf;
			int length;
			int counter = 0;
			int counter2 = 0;
			
			System.out.print("\033[H\033[2J");
			System.out.println("Enter the first String: ");		//Ask user to enter first string
			first = userInput.nextLine();	//Collect and store user input
			
			//Construct a string array named blankArray that has the length of the first input
			String[] blankArray = new String[first.length()];	
			
			//Create a for loop to copy the characters in user input into the blankArray
			for(int i = 0; i < first.length(); i++){
				blankArray[i] = Character.toString(first.charAt(i));
			}
			
			//Ask user to enter the replacement string, system collect and store the answer
			System.out.println("Enter the replacement String: ");
			replacement = userInput.nextLine();
			
			//Create an if statement that checks if the first user input contains "*", if not, out put "Error: no *" and end the loop
			if(first.indexOf("*") == -1){
				System.out.println("Error: no *");
				loop = 1;
			}
			else{
				//Use a nested for loop to check if each character in blankArray is contained in the string array named list
				for(int j = 0; j < first.length(); j++){
					for(int k = 0; k < list.length; k++){
						//If the element in blankArray is contained in the list, then increase counter value by 1
						if(blankArray[j].equalsIgnoreCase( list[k] )){
							counter++;
						}
					}
				}
				//If the counter value equals to the first length, then create a for loop to check if user input contains more than 1 "*", if it does, then print out the replacement string to replace the "*", else print out the elements within the blank array in order
				if(counter == first.length()){
					for(int i = 0; i < first.length(); i++){
						if(blankArray[i].contains("*")){
							System.out.print(replacement);
						}
						else{
							System.out.print(blankArray[i]);
						}
					}
				}
				else{
					System.out.println("Error: Incorrect characters");
				}		
			}
			
			System.out.println("\nDo you want to try this program again?");
			String answer = userInput.nextLine();
			
			//If the answer is "yes", then repeat the loop
			if(answer.equalsIgnoreCase("yes")){
				loop = 0;
			}
			//Else end the loop
			else{
				System.out.print("\033[H\033[2J");
				System.out.println("Thank you for trying this program!");
				loop = 1;
			}
		}
	}
}