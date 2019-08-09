package model.provinces;

public class OnTax extends ProvinceTax {
    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public OnTax(double income) {
        super();
        try {
            this.at = calcAT(income);
        } catch (NonValidIncomeException e) {
            e.printError();
            this.at = -0.000000001;
        }
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax rate values
     */
    public void iniRates() {
        taxRates = new double[11];
        taxRates[0] = 0.2005;
        taxRates[1] = 0.2415;
        taxRates[2] = 0.2965;
        taxRates[3] = 0.3148;
        taxRates[4] = 0.3389;
        taxRates[5] = 0.3791;
        taxRates[6] = 0.4341;
        taxRates[7] = 0.4641;
        taxRates[8] = 0.4797;
        taxRates[9] = 0.5197;
        taxRates[10] = 0.5353;
    }

    @Override
    /**
     * MODIFIES this
     * EFFECTS initializes the array of tax bracket values
     */
    public void iniTax() {
        taxBrackets = new int[10];
        taxBrackets[0] = 43906;
        taxBrackets[1] = 3724;
        taxBrackets[2] = 29683;
        taxBrackets[3] = 10500;
        taxBrackets[4] = 3288;
        taxBrackets[5] = 4158;
        taxBrackets[6] = 52408;
        taxBrackets[7] = 2333;
        taxBrackets[8] = 60371;
        taxBrackets[9] = 9629;
    }
}
