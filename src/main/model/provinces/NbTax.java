package model.provinces;

/**
 *
 */
public class NbTax extends ProvinceTax {
    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public NbTax(double income) {
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
        taxRates = new double[9];
        taxRates[0] = 0.2468;
        taxRates[1] = 0.2982;
        taxRates[2] = 0.3532;
        taxRates[3] = 0.3702;
        taxRates[4] = 0.4252;
        taxRates[5] = 0.4384;
        taxRates[6] = 0.4684;
        taxRates[7] = 0.493;
        taxRates[8] = 0.5333;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[8];
        taxBrackets[0] = 42592;
        taxBrackets[1] = 5038;
        taxBrackets[2] = 37554;
        taxBrackets[3] = 10075;
        taxBrackets[4] = 43232;
        taxBrackets[5] = 9176;
        taxBrackets[6] = 10111;
        taxBrackets[7] = 52593;
    }
}
