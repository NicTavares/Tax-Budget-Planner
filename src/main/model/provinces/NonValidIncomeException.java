package model.provinces;

public class NonValidIncomeException extends Exception {

    //EFFECTS prints the error message
    public void printError() {
        System.out.println("The input was not valid");
    }

}
