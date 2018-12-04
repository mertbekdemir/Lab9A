
/**
 * Write a description of class Canada here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Canada
{
    //Constants
    public static final int BC = 0;
    public static final int AB = 1;
    public static final int SK = 2;
    public static final int MB = 3;
    public static final int ON = 4;
    public static final int QC = 5;
    public static final int NB = 6;
    public static final int NS = 7;
    public static final int PE = 8;
    public static final int NL = 9;
    public static final int YK = 10;
    public static final int NT = 11;
    public static final int NV = 12;
    public static final int NUM_PROVINCES = 13;
    public static final int NAME_OF_PROVINCE = 0;
    public static final int NAME_OF_CAPITAL_CITY = 1;
    public static final int NAME_OF_BIGGEST_CITY = 2;
    public static final int NUM_NAMES = 3;

    // Instance variables
    private String[][] provinces;

    /**
     * Creates all the provinces, province's capital and province's largest city by population
     */
    public Canada() {

        //Initialize the array 
        provinces = new String[NUM_PROVINCES][NUM_NAMES];

        // Set the elements in the array 
        provinces[BC][NAME_OF_PROVINCE] = "British Columbia";
        provinces[BC][NAME_OF_CAPITAL_CITY] = "Victoria";
        provinces[BC][NAME_OF_BIGGEST_CITY] = "Vancouver";
        provinces[PE][NAME_OF_PROVINCE] = "Prince Edward Island";
        provinces[PE][NAME_OF_CAPITAL_CITY] = "Charlottetown";
        provinces[PE][NAME_OF_BIGGEST_CITY] = "Charlottetown";
        provinces[SK][NAME_OF_PROVINCE] = "Saskatchewan";
        provinces[SK][NAME_OF_CAPITAL_CITY] = "Regina";
        provinces[SK][NAME_OF_BIGGEST_CITY] = "Saskatoon";
        provinces[AB][NAME_OF_PROVINCE] = "Alberta";
        provinces[AB][NAME_OF_CAPITAL_CITY] = "Edmonton";
        provinces[AB][NAME_OF_BIGGEST_CITY] = "Calgary";
        provinces[NL][NAME_OF_PROVINCE] = "Newfoundland and Labrador";
        provinces[NL][NAME_OF_CAPITAL_CITY] = "St. John's";
        provinces[NL][NAME_OF_BIGGEST_CITY] = "St. John's";
        provinces[YK][NAME_OF_PROVINCE] = "Yukon";
        provinces[YK][NAME_OF_CAPITAL_CITY] = "WhiteHorse";
        provinces[YK][NAME_OF_BIGGEST_CITY] = "Whitehorse";
        provinces[NV][NAME_OF_PROVINCE] = "Nunavut";
        provinces[NV][NAME_OF_CAPITAL_CITY] = "Iqaluit";
        provinces[NV][NAME_OF_BIGGEST_CITY] = "Iqaluit";
        provinces[NT][NAME_OF_PROVINCE] = "Northwest Territories";
        provinces[NT][NAME_OF_CAPITAL_CITY] = "Yellowknife";
        provinces[NT][NAME_OF_BIGGEST_CITY] = "Yellowknife";
        provinces[ON][NAME_OF_PROVINCE] = "Ontario";
        provinces[ON][NAME_OF_CAPITAL_CITY] = "Toronto";
        provinces[ON][NAME_OF_BIGGEST_CITY] = "Toronto";
        provinces[QC][NAME_OF_PROVINCE] = "Quebec";
        provinces[QC][NAME_OF_CAPITAL_CITY] = "Quebec City";
        provinces[QC][NAME_OF_BIGGEST_CITY] = "Montreal";
        provinces[NS][NAME_OF_PROVINCE] = "Nova Scotia";
        provinces[NS][NAME_OF_CAPITAL_CITY] = "Halifax";
        provinces[NS][NAME_OF_BIGGEST_CITY] = "Halifax";
        provinces[NB][NAME_OF_PROVINCE] = "New Brunswick";
        provinces[NB][NAME_OF_CAPITAL_CITY] = "Fredericton";
        provinces[NB][NAME_OF_BIGGEST_CITY] = "Saint John";
        provinces[MB][NAME_OF_PROVINCE] = "Manitoba";
        provinces[MB][NAME_OF_CAPITAL_CITY] = "Winnipeg";
        provinces[MB][NAME_OF_BIGGEST_CITY] = "Winnipeg";
    }

    /**
     *Gets the capital city of province entered
     *@param province name of the province 
     */
    public String getCapitalCityOf(String province) {

        if (null == province || province.equals("")) {
            throw new IllegalArgumentException("Invalid Province Name");
        }

        for(int i = 0; i < provinces.length; i++) {

            if(provinces[i] != null && 
            provinces[i][NAME_OF_PROVINCE] != null &&
            provinces[i][NAME_OF_PROVINCE].equalsIgnoreCase(province)) {
                return provinces[i][NAME_OF_CAPITAL_CITY];
            }

        }
        return null;
    }

    /**
     * Gets the largest city of province entered
     * @param province name of the province
     */
    public String getLargestCityOf(String province){

        if (null == province || province.equals("")) {
            throw new IllegalArgumentException("Invalid Province Name");
        }

        for(int i = 0; i < provinces.length; i++) {

            if(provinces[i] != null &&
            provinces[i][NAME_OF_PROVINCE] != null &&
            provinces[i][NAME_OF_PROVINCE].equalsIgnoreCase(province)) {
                return provinces[i][NAME_OF_BIGGEST_CITY];   
            }

        }

        return null;
    }

    /**
     * Gets the province whose capital city is entered
     * @param city is the capital city
     */
    public String getProvinceWhoseCapitalIs(String city) {

        if (null == city || city.equals("")) {
            throw new IllegalArgumentException("Invalid Province Name");
        }

        for(int i = 0; i < provinces.length; i++) {

            if(provinces[i] != null &&
            provinces[i][NAME_OF_CAPITAL_CITY] != null &&
            provinces[i][NAME_OF_CAPITAL_CITY].equalsIgnoreCase(city)) {

                return provinces[i][NAME_OF_PROVINCE];
            }
        }

        return null;
    }

    /**
     * prints all province info
     */
    public void displayAllProvinceInfo() {
        
        for(int i = 0; i < provinces.length; i++) {

            
            if(provinces[i] != null &&
                provinces[i][NAME_OF_PROVINCE] != null && 
                provinces[i][NAME_OF_CAPITAL_CITY].equalsIgnoreCase(provinces[i][NAME_OF_BIGGEST_CITY])) {
                    System.out.println("The capital city of " + provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " + provinces[i][NAME_OF_CAPITAL_CITY] + ", and it is also the largest city.");
            
            }
              else if(provinces[i] != null &&
            provinces[i][NAME_OF_PROVINCE] != null) {
                System.out.println("The capital city of " +provinces[i][NAME_OF_PROVINCE].toUpperCase() + " is " +provinces[i][NAME_OF_CAPITAL_CITY] + ", but the largest city is " 
                +provinces[i][NAME_OF_BIGGEST_CITY] + ".");
            }
       
    }
}
}
