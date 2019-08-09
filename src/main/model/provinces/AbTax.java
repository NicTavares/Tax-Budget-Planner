package model.provinces;

/**
 * Alberta class, used to calculate the after tax vlue of an income in Alberta
 */
public class AbTax extends ProvinceTax {
    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public AbTax(double income) {
        super();
        try {
            this.at = calcAT(income);
        } catch (NonValidIncomeException e) {
            System.out.println("Non valid income value.");
            this.at = -0.0000000001;
        }
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[8];
        taxBrackets[0] = 47630;
        taxBrackets[1] = 47629;
        taxBrackets[2] = 35961;
        taxBrackets[3] = 16447;
        taxBrackets[4] = 9797;
        taxBrackets[5] = 52488;
        taxBrackets[6] = 419;
        taxBrackets[7] = 104557;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate values
     */
    public void iniRates() {
        taxRates = new double[9];
        taxRates[0] = 0.25;
        taxRates[1] = 0.305;
        taxRates[2] = 0.36;
        taxRates[3] = 0.38;
        taxRates[4] = 0.41;
        taxRates[5] = 0.42;
        taxRates[6] = 0.43;
        taxRates[7] = 0.47;
        taxRates[8] = 0.48;
    }
}
