/*
Chapter 4 Programming excercise 12
Riky Hernandez
8/31/21
Description: program that turns a hex digit to a binary number
*/
package exercise4_12;

import java.util.Scanner;
public class Exercise4_12 {

   
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            //user inputs a hex digit
            System.out.print("Enter a hex digit: ");
            char hex = input.nextLine().charAt(0);
            
            //the result of 
            String result = "";
            
            //get the hex and matches to a case to get its result
            switch(hex) {
                case '0' : result = "0" ; break ;   
                 case '1' : result = "1" ; break ;  
                  case '2' : result = "10" ; break ;  
                   case '3' : result = "11" ; break ;  
                    case '4' : result = "100" ; break ;  
                     case '5' : result = "101" ; break ;  
                      case '6' : result = "110" ; break ;  
                       case '7' : result = "111" ; break ;  
                        case '8' : result = "1000" ; break ;  
                         case '9' : result = "1001" ; break ;  
                          case 'A' : result = "1010" ; break ; 
                           case 'B' : result = "1011" ; break ;  
                            case 'C' : result = "1100" ; break ;  
                             case 'D' : result = "1101" ; break ;  
                              case 'E' : result = "1110" ; break ;  
                               case 'F' : result = "1111" ; break ;  
                               default: System.out.println(hex + " is an invalid input");
            }
                    //prints the results if the input is not invalid       
                   System.out.println("The binary value is " + result);
                      
           
            
            
        
        
    }
    
}
