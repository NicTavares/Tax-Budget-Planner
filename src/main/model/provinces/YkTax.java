package model.provinces;

public class YkTax extends ProvinceTax {

    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public YkTax(double income) {
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
        taxRates = new double[6];
        taxRates[0] = 0.214;
        taxRates[1] = 0.295;
        taxRates[2] = 0.369;
        taxRates[3] = 0.418;
        taxRates[4] = 0.458;
        taxRates[5] = 0.48;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[5];
        taxBrackets[0] = 47630;
        taxBrackets[1] = 47629;
        taxBrackets[2] = 52408;
        taxBrackets[3] = 62704;
        taxBrackets[4] = 289629;

    }
}
