package model.provinces;

/**
 *
 */
public class NflTax extends ProvinceTax {
    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public NflTax(double income) {
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
        taxRates[0] = 0.237;
        taxRates[1] = 0.295;
        taxRates[2] = 0.35;
        taxRates[3] = 0.363;
        taxRates[4] = 0.418;
        taxRates[5] = 0.433;
        taxRates[6] = 0.463;
        taxRates[7] = 0.473;
        taxRates[8] = 0.513;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[8];
        taxBrackets[0] = 37591;
        taxBrackets[1] = 10039;
        taxBrackets[2] = 27551;
        taxBrackets[3] = 19088;
        taxBrackets[4] = 38955;
        taxBrackets[5] = 13443;
        taxBrackets[6] = 40356;
        taxBrackets[7] = 22458;
    }
}
