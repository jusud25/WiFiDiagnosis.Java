package rng;
import java.util.Scanner;
public class RandomNumberGuesser{
	/**
	 * This program asks the user to enter a guess and then ask again until the iteration is 
	 * completed at which time, the program will ask the user to enter yes or no. After that the 
	 * program will thank the user.
	 * 
	 * 
	 * @author Jusu Dukuly
	 */
	public static void main(String[] args) {
                    int randNum, nextGuess, highGuess, lowGuess;
                    String classNum;
                    char numOfResp = 0;
                    
                    Scanner keyboard= new Scanner (System.in);
                    
                    RNG rng= new RNG();
                    
                    //Do while loop read iteration before evaluating the expression
                    do {
                    lowGuess=1;
                    highGuess=100;
                    randNum=RNG.rand();
                    RNG.resetCount();
                    System.out.println("Enter your first guess");
                    
                    nextGuess= keyboard.nextInt();
                    
                                    
                    do {
                    
                    //Comparison 
                    if (nextGuess>randNum) {
                            
                    	//Using the if statement to do comparison
                            if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
                       {
                           if (nextGuess>=highGuess || nextGuess<=lowGuess)
                           {
                               lowGuess=nextGuess;
                               
                           }
                       	if (nextGuess>=highGuess || nextGuess<=lowGuess)
                           {
                               highGuess=nextGuess;
                           }
                       }
                           //To print display in output 
                    System.out.println("Number of guesses is "+rng.getCount());     
                            
                    System.out.println("Your guess is too high");
                    
                    highGuess=nextGuess;
                                                                    
                    System.out.println("Enter your next guess between "+lowGuess+" and "+highGuess);
                    
                    nextGuess= keyboard.nextInt();
                    
                    } else if (nextGuess<randNum) { 
                    
                            if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
                       {
                        if (nextGuess>=highGuess || nextGuess<=lowGuess)
                           {
                               lowGuess=nextGuess;
                           }
                    	if (nextGuess>=highGuess || nextGuess<=lowGuess)
                           {
                               highGuess=nextGuess;
                           }
                       }
                            //To display in console out
                    System.out.println("Number of guesses is "+rng.getCount());     
                            
                    System.out.println("Your guess is too low");
                            
                    lowGuess=nextGuess;
                            
                    System.out.println("Enter your next guess between "+lowGuess+" and "+highGuess);
                    
                    nextGuess= keyboard.nextInt();
                    }
                    }while (nextGuess!=(randNum));
                    
                    if(RNG.inputValidation(nextGuess, lowGuess, highGuess))
            {
                    	if (nextGuess>=highGuess || nextGuess<=lowGuess) 
                {
                    lowGuess=nextGuess;
                }
               if (nextGuess>=highGuess || nextGuess<=lowGuess)
                {
                    highGuess=nextGuess;
                }
            }
             
                    ////To display in console out
                    System.out.println("Number of guesses is "+ rng.getCount());
                    System.out.println("Congradulations, you guessed correctly \n Try again (y or n)");     
                    
                    classNum=keyboard.next();
                    
                    numOfResp=classNum.charAt(0);
                    
                    while (numOfResp != 'Y' && numOfResp != 'y' && numOfResp != 'N' && numOfResp != 'n')
            {       System.out.print("Please enter Yes or No: ");
                            classNum=keyboard.nextLine();
                            numOfResp=classNum.charAt(0);}
                    
                    }while (numOfResp=='Y' || numOfResp=='y');
                    System.out.println("Thank you for playing...");
                   
                    }

    }     
		 
		  