package model.income;

public class Budget {

    //REQUIRES a valid numeric based string
    //EFFECTS returns proportion of said value that should be spent on rent
    public static int getRent(String aftertax) {
        int monthly = getMonthly(aftertax);
        return (int)(0.3 * monthly);
    }

    //REQUIRES a valid numeric based string
    //EFFECTS returns proportion of said value that should saved
    public static int getSavings(String aftertax) {
        int monthly = getMonthly(aftertax);
        return (int)(0.15 * monthly);
    }

    //REQUIRES a valid numeric based string
    //EFFECTS returns proportion of said value that should be invested
    public static int getInvestments(String aftertax) {
        int monthly = getMonthly(aftertax);
        return (int)(0.25 * monthly);
    }

    //REQUIRES a valid numeric based string
    //EFFECTS returns proportion of said value that should be spent on food
    public static int getFood(String aftertax) {
        int monthly = getMonthly(aftertax);
        return (int)(0.15 * monthly);
    }

    //REQUIRES a valid numeric based string
    //EFFECTS returns proportion of said value that should be spent on entertainment
    public static int getEntertainment(String aftertax) {
        int monthly = getMonthly(aftertax);
        return (int)(0.15 * monthly);
    }

    //REQUIRES a valid numeric based string that represents yearly salary
    //EFFECTS returns the monthly income
    private static int getMonthly(String aftertax) {
        int ati = 0;
        try {
            ati = Integer.parseInt(aftertax);
        } catch (Exception e) {
            return -1;
        }
        return ati / 12;
    }


}
