package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Use a map to solve
 */
public class MonthConversion {
    private Map<Integer,String> months;
    /**
     * @param monthNumber - ordinal of month in the year; i.e. January = 1, February = 2
     * @param monthName - name of month
     */
    public MonthConversion(){
        int counter=1;
        this.months = new HashMap<>();
/*        this.months.put(counter++,"January");
        this.months.put(counter++,"February");
        this.months.put(counter++,"March");
        this.months.put(counter++,"April");
        this.months.put(counter++,"May");
        this.months.put(counter++,"June");
        this.months.put(counter++,"July");
        this.months.put(counter++,"August");
        this.months.put(counter++,"September");
        this.months.put(counter++,"October");
        this.months.put(counter++,"November");
        this.months.put(counter,"December");*/
    }

    public void add(Integer monthNumber, String monthName) {
        this.months.put(monthNumber,monthName);
    }

    /**
     * @param monthNumber - ordinal of month in the year
     * @return the name of the respective month
     */
    public String getName(Integer monthNumber) {
        try{
            return this.months.get(monthNumber);
        } catch (NullPointerException npe) {
            throw new NullPointerException();
        }
    }

    /**
     * @param monthName - name of month
     * @return - the ordinal of the month in the year
     */
    public int getNumber(String monthName) {
        for(Map.Entry<Integer,String> entry:this.months.entrySet()){
            if(entry.getValue().equals(monthName))return entry.getKey();
        }
        return -1;
    }

    /**
     * @param monthNumber
     * @return true if the monthNumber is in the keySet
     */
    public Boolean isValidNumber(Integer monthNumber) {
        if(this.months.size()==0) return false;
        return this.months.keySet().contains(monthNumber);
    }

    /**
     * @param monthName
     * @return true if the monthName is in the valueSet
     */
    public Boolean isValidMonth(String monthName) {
        return this.months.values().contains(monthName);
    }

    /**
     * @return number of entries in this mapping
     */
    public Integer size() {
        return this.months.size();
    }

    /**
     * @param monthNumber - number of month in year
     * @param monthName - name of month
     */
    public void update(Integer monthNumber, String monthName) {
        this.months.replace(monthNumber,monthName);
    }
}
