package model.provinces;

/**
 *
 */
public class NwTTax extends ProvinceTax {

    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public NwTTax(double income) {
        super();
        try {
            this.at = calcAT(income);
        } catch (NonValidIncomeException e) {
            e.printError();
            this.at = -0.00000001;
        }
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate values
     */
    public void iniRates() {
        taxRates = new double[8];
        taxRates[0] = 0.209;
        taxRates[1] = 0.236;
        taxRates[2] = 0.291;
        taxRates[3] = 0.327;
        taxRates[4] = 0.382;
        taxRates[5] = 0.4005;
        taxRates[6] = 0.4305;
        taxRates[7] = 0.4705;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[7];
        taxBrackets[0] = 43137;
        taxBrackets[1] = 4493;
        taxBrackets[2] = 38647;
        taxBrackets[3] = 8982;
        taxBrackets[4] = 45008;
        taxBrackets[5] = 7400;
        taxBrackets[6] = 62704;
    }
}
