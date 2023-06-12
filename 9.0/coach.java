// Coach class
class Coach
{
    // include an instance field for each field in Coach file
    private String coach_id;
    private String coach_url;
    private String short_name;
    private String long_name;
    private String dob;
    private String nationality_id;
    private String nationality_name;
    
    // Coach constructor
    public Coach(String c_id, String c_url, String c_sn, String c_ln, String dob, 
                 String c_ni, String c_nn)
    {
        this.coach_id = c_id;
        this.coach_url = c_url;
        this.short_name = c_sn;
        this.long_name = c_ln;
        this.dob = dob;
        this.nationality_id = c_ni;
        this.nationality_name = c_nn;
    }
    
    /*
        Calculate age based on year, month and day
        @return int representing age
    */
    public int getAge()
    {
        // if dob length is less than 4, not a valid age
        if (dob.length() <= 4)
            return -1;
        else
        {
            int year = Integer.parseInt(dob.substring(0,4)) * 10000;
            
            int loc = dob.indexOf("-");
            int month = Integer.parseInt(dob.substring(loc + 1,loc + 3)) * 100;
            
            loc = dob.indexOf("-", loc + 1);
            int day = Integer.parseInt(dob.substring(loc + 1));
        
            return year + month + day;
        }
    }
    
    /*
        toString method returns object as a String. Automatically called when
        a Coach object is included in a .println() or .print() method call.
        @return object as a String
    */
    public String toString()
    {
        String temp = "\nCoach ID: " + coach_id;
        temp += "\nCoach URL: " + coach_url;
        temp += "\nShort name: " + short_name;
        temp += "\nLong name: " + long_name;
        temp += "\nDate of birth: " + dob;
        temp += "\nNationality: " + nationality_name;
        temp += "\nAge: " + getAge();
        
        return temp;
    }
}
