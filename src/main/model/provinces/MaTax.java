package model.provinces;

import model.provinces.*;

/**
 * The Manitoba class, used for calculating the after tax value of an income earned in this province
 */
public class MaTax extends ProvinceTax {
    /**
     * MODIFIES this
     * EFFECTS creates the object and initializes the arrays for tax rates and tax brackets and then calculates
     *          the after tax field
     * @param income a double value
     */
    public MaTax(double income) {
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
     * EFFECTS initializes the array of tax bracket values for this province
     */
    public void iniTax() {
        taxBrackets = new int[6];
        taxBrackets[0] = 32670;
        taxBrackets[1] = 14960;
        taxBrackets[2] = 22980;
        taxBrackets[3] = 24649;
        taxBrackets[4] = 52408;
        taxBrackets[5] = 62704;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate value for this province
     */
    public void iniRates() {
        taxRates = new double[7];
        taxRates[0] = 0.258;
        taxRates[1] = 0.2775;
        taxRates[2] = 0.3325;
        taxRates[3] = 0.379;
        taxRates[4] = 0.434;
        taxRates[5] = 0.464;
        taxRates[6] = 0.504;
    }
}
