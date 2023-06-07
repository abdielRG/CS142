/*
    Abdiel Ramirez
    CS 142
    June 3, 2023
    M9 Coding

    Description:
    This program is a modified version of one originally created by Professor Catherine Wyman.
    It will read from a file containing data on female soccer coaches then find and
    output the name of the oldest coach as well as find and output the name of the youngest coach.
    
    Test data:
    Input                Output                   Expected         Pass/Fail
    female_coaches.csv   (youngest)H.Busby        H.Busby          Pass
    female_coaches.csv   (oldest)P.Gerhardson     P. Gerdhardson   Pass
*/

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException 
    {
        
        /*
            set up file stream object and variables
        */
        FileInputStream fileByteStream = null;
        Scanner inFS = null;
        Scanner inSS = null;
        String coachInfo = "";
        int count = 0;
        ArrayList<Coach> coaches = new ArrayList<Coach>();
        
        System.out.println("Opening file female_coaches.csv");
        fileByteStream = new FileInputStream("female_coaches.csv");
        inFS = new Scanner(fileByteStream);
        
        /*
            while there is still data to read in the file, read record, create Coach object,
            put Coach object in ArrayList
        */
        while(inFS.hasNextLine())
        {
            coachInfo = inFS.nextLine();
            inSS = new Scanner(coachInfo);
            inSS.useDelimiter(",");
            
            String coach_id = inSS.next();
            String coach_url = inSS.next();
            String short_name = inSS.next();
            String long_name = inSS.next();
            String dob = inSS.next();
            String nationality_id = inSS.next();
            String nationality_name = inSS.next();
            coaches.add(new Coach(coach_id, coach_url, short_name, long_name, dob, 
                                  nationality_id, nationality_name));
                                  
            //REMOVED: print record just to validate that it works   
            /*
            System.out.println("Record: " + (count + 1) + "\n" + coaches.get(count));
            count++;
            */

        }
        
        // find and output the youngest coach
        System.out.println("\nThe youngest coach is:" + findYoungest(coaches));

        //find and output the oldest coach
        System.out.println("\nThe oldest coach is:" + findOldest(coaches));
          
        // close file stream objects      
        fileByteStream.close();
        inFS.close();
    }
    
    /*
        findYoungest method finds and returns the youngest coach in the cList
        @param cList ArrayList containing Coach objects
        @return Coach object with the youngest age
    */
    public static Coach findYoungest(ArrayList<Coach> cList)
    {
        // initialize youngest to first Coach object in the list
        Coach youngest = cList.get(0);
        
        // iterate over the list testing the youngest object against the current object 
        for(int idx = 1; idx < cList.size(); idx++)
        {
            // compare Coach objects
            if (youngest.getAge() < cList.get(idx).getAge())
            {
                youngest = cList.get(idx);
            }
        }
        return youngest;
    }

    /*
        findOldest method finds and returns the oldest Coach in cList
        @param cList ArrayList containing Coach objects
        @return Coach object with the oldest age
    */
    public static Coach findOldest(ArrayList<Coach> cList)
    {
        Coach oldestCoach = cList.get(0);
        
        for (int idx = 1; idx < cList.size(); ++idx)
        {
            if (oldestCoach.getAge() > cList.get(idx).getAge() && cList.get(idx).getAge() > 0)
            {
                oldestCoach  = cList.get(idx);
            }
        }
        return oldestCoach;
    }
}
