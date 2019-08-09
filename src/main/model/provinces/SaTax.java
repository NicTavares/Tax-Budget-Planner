package model.provinces;

public class SaTax extends ProvinceTax {

    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public SaTax(double income) {
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
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[6];
        taxBrackets[0] = 45225;
        taxBrackets[1] = 2405;
        taxBrackets[2] = 47629;
        taxBrackets[3] = 33955;
        taxBrackets[4] = 18453;
        taxBrackets[5] = 62704;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate values
     */
    public void iniRates() {
        taxRates = new double[7];
        taxRates[0] = 0.255;
        taxRates[1] = 0.275;
        taxRates[2] = 0.33;
        taxRates[3] = 0.385;
        taxRates[4] = 0.405;
        taxRates[5] = 0.435;
        taxRates[6] = 0.475;

    }
}
