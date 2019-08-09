package model.provinces;

/**
 * British Columbia class, used to calculate the after tax value of an income earned in this province
 */
public class BcTax extends ProvinceTax {
    /**
     * MOIFIES this
     * EFFECTS creates the object and initializes the arrays for tax rates and tax brackets and then calculates
     *          the after tax field
     * @param income a double value
     */
    public BcTax(double income) {
        super();
        try {
            this.at = calcAT(income);
        } catch (NonValidIncomeException e) {
            System.out.println("Non valid income value.");
            this.at = -0.00000001;
        }
    }


    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values for this province
     */
    public void iniTax() {
        taxBrackets = new int[9];
        taxBrackets[0] = 40707;
        taxBrackets[1] = 6923;
        taxBrackets[2] = 33786;
        taxBrackets[3] = 12060;
        taxBrackets[4] = 1783;
        taxBrackets[5] = 18247;
        taxBrackets[6] = 34161;
        taxBrackets[7] = 6233;
        taxBrackets[8] = 54671;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate value for this province
     */
    public void iniRates() {
        taxRates = new double[10];
        taxRates[0] = 0.2006;
        taxRates[1] = 0.227;
        taxRates[2] = 0.282;
        taxRates[3] = 0.31;
        taxRates[4] = 0.3279;
        taxRates[5] = 0.3829;
        taxRates[6] = 0.407;
        taxRates[7] = 0.437;
        taxRates[8] = 0.458;
        taxRates[9] = 0.498;
    }

}
