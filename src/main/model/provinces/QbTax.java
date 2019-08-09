package model.provinces;

public class QbTax extends ProvinceTax {

    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public QbTax(double income) {
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
        taxBrackets[0] = 43790;
        taxBrackets[1] = 3840;
        taxBrackets[2] = 39945;
        taxBrackets[3] = 7684;
        taxBrackets[4] = 11296;
        taxBrackets[5] = 41112;
        taxBrackets[6] = 62704;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniRates() {
        taxRates = new double[8];
        taxRates[0] = 0.2753;
        taxRates[1] = 0.3253;
        taxRates[2] = 0.3712;
        taxRates[3] = 0.4112;
        taxRates[4] = 0.4571;
        taxRates[5] = 0.4746;
        taxRates[6] = 0.4997;
        taxRates[7] = 0.5331;
    }
}
