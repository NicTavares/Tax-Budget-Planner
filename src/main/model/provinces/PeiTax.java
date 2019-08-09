package model.provinces;

public class PeiTax extends ProvinceTax {
    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public PeiTax(double income) {
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
    public void iniTax() {
        taxBrackets = new int[7];
        taxBrackets[0] = 31984;
        taxBrackets[1] = 15648;
        taxBrackets[2] = 16339;
        taxBrackets[3] = 31290;
        taxBrackets[4] = 3738;
        taxBrackets[5] = 48670;
        taxBrackets[6] = 62704;

    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniRates() {
        taxRates = new double[8];
        taxRates[0] = 0.248;
        taxRates[1] = 0.288;
        taxRates[2] = 0.343;
        taxRates[3] = 0.372;
        taxRates[4] = 0.427;
        taxRates[5] = 0.4437;
        taxRates[6] = 0.4737;
        taxRates[7] = 0.5137;
    }

}
