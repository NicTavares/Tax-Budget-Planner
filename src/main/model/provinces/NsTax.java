package model.provinces;

/**
 *
 */
public class NsTax extends ProvinceTax {

    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public NsTax(double income) {
        super();
        try {
            this.at = calcAT(income);
        } catch (NonValidIncomeException e) {
            e.printError();
            this.at = -0.000000000001;
        }
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate values
     */
    public void iniRates() {
        taxRates = new double[11];
        taxRates[0] = 0.2379;
        taxRates[1] = 0.2432;
        taxRates[2] = 0.3048;
        taxRates[3] = 0.3598;
        taxRates[4] = 0.3770;
        taxRates[5] = 0.3717;
        taxRates[6] = 0.38;
        taxRates[7] = 0.435;
        taxRates[8] = 0.465;
        taxRates[9] = 0.5;
        taxRates[10] = 0.54;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[10];
        taxBrackets[0] = 25000;
        taxBrackets[1] = 4590;
        taxBrackets[2] = 18040;
        taxBrackets[3] = 11550;
        taxBrackets[4] = 15819;
        taxBrackets[5] = 18001;
        taxBrackets[6] = 2259;
        taxBrackets[7] = 54208;
        taxBrackets[8] = 2333;
        taxBrackets[9] = 60371;
    }
}
