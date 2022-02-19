/** Sophia Wang
   feb 13
   Description:
    Read the file at https://github.com/ngryman/lol-champions/blob/master/champions.json. In the file, MaxChampStats.txt, write out in separate lines:
    a) the name and hp of the champion with the highest hp
    b) the name and armor of the champion with the lowest armor
*/

import java.io.*;
public class Wang_Sophia_ChampionFilter{
   public static void main (String[] args){
   
     // variables
     double highestHp = 0;
     int indexHighestHp = 0;
     int indexLowestArmor = 0;
     double lowestArmor = 100; 
     int lineNum = 0;
     
     //counters
     int x=0;
     int y=0;
     int z=0;
     
     //finding line number
     try {
         File f = new File ("champions.json"); 
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         
         //reading a line from the file while there are more lines to read
         String line;         
         while ((line = br.readLine()) != null) {
            lineNum++;
         }
      
      br.close();
      fr.close();
      }catch (IOException e) {
      System.out.println("Cannot read file");
      }

     //initializing arrays for values
     double [] armor = new double [lineNum/38]; // dividing by 38 bc each chaarcter has about 38 to 39 lines of stats (assuming 39 lines each may result in the array being shorter than it should be so i used 38)
     double [] hp = new double [lineNum/38];
     String [] names = new String [lineNum/38]; 
      
      try {
         File f = new File ("champions.json"); 
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         
         //reading a line from the file while there are more lines to read
         String line;                  
         while ((line = br.readLine()) != null) {
            
            //finding lines with certain words
            //name
            if (line.contains("\"name\"")) {
               names[x] = line.substring(12,line.length()-1);
               x++;
            } 
            //hp
            if (line.contains("\"hp\"")) {
               hp[y] = Double.parseDouble(line.substring(12,line.length()-1));//storing hp
               if(hp[y] > highestHp){
                  highestHp = hp [y];//storing current hp in variable if its the highest
                  indexHighestHp = y;//storing the index of the highest
               }
               y++;
            }  
            //armor
            if (line.contains("\"armor\"")) {
               armor[z] = Double.parseDouble(line.substring(15,line.length()-1));
               if(armor[z] < lowestArmor){
                  lowestArmor = armor [z];
                  indexLowestArmor = z;
               }
               z++;
            }                            
         }
         //closing readers
         br.close();
         fr.close();
      }
      catch (IOException e) {
         System.out.println("Cannot read file");
      }
      
      //writing too file
      try {
      
      File file = new File("MaxChampStats.txt");
      FileWriter fileWriter = new FileWriter(file);
      BufferedWriter output = new BufferedWriter(fileWriter);

      // Writes the string to the file
     // output.write(data);
      //moves to the next line
      //output.newLine();

      //output can only write String data, so you may need to cast data into string
      output.write("" + highestHp);
      output.write(" " +  names[indexHighestHp]);
      output.write("\n" + lowestArmor);
      output.write(" " + names[indexLowestArmor]);


      // Closes the writers
      output.close();
      fileWriter.close();
      }
    //if there is a problem with writing
      catch (IOException e) {
      System.out.println("Sorry, cannot write to that file.");
      }
      
      
      
      
      //output
      System.out.println(highestHp);
      System.out.println(names[indexHighestHp]);
      System.out.println(lowestArmor);       
      System.out.println(names[indexLowestArmor]);
      System.out.println(names[1]);
      System.out.println(names[2]);
      System.out.println(names[3]);
      System.out.println(names[4]);
      System.out.println(names[5]);
         
   }
}
