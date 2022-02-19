/** Sophia Wang
    feb 13
    description: 
    -first and last character of each word are exchanged.
    -Middle characters of each word are shifted to the character two after it in the ASCII table (works for non-letters as well.)
    -spaces are kept and unchanged

Example:
Input: Enter a line to be encrypted: Happy Days!
Output: The encryption is: ycrrH !c{uD
*/

import java.util.Scanner;

public class Wang_Sophia_Encryption2 {
   public static void main (String[] args){
      Scanner in = new Scanner (System.in);//scanner
         
      //takes an inputed sentence and splits it into words
      String sentence = in.nextLine();//
      String [] words = sentence.split(" ");
      
      //variables
      char [] encryptChar;
      String [] encryptWord = new String [words.length - 1];

      
      //looping through each word
      for (int i = 0; i<words.length;i++){
         encryptChar = new char [words[i].length()+1];
         //switching first and last letter
         encryptChar[0] = words[i].charAt(words[i].length()-1);
         encryptChar[words[i].length()-1] = words[i].charAt(0);
         encryptChar[words[i].length()] = ' ';//adds a space at the end of every word
         
         
         //looping through each letter in the word
         for (int x = 1; x < words[i].length()-1; x++){
            encryptChar[x] = (char)(words[i].charAt(x) + 2);//moves character by 2
         }
         System.out.print(encryptChar);
      }
   }
}
