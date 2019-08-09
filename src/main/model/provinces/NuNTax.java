package model.provinces;

public class NuNTax extends ProvinceTax {

    /**
     * MODIFIES this
     * EFFECTS initializes the tax rates and brackets arrays and uses them to calculate the at field which
     *          is the after tax income of the specific object created using a specific income number
     * @param income a double value
     */
    public NuNTax(double income) {
        super();
        try {
            this.at = calcAT(income);
        } catch (NonValidIncomeException e) {
            e.printError();
            this.at = -0.0000000001;
        }
    }

    @Override
    public void iniRates() {
        taxRates = new double[7];
        taxRates[0] = 0.19;
        taxRates[1] = 0.22;
        taxRates[2] = 0.275;
        taxRates[3] = 0.295;
        taxRates[4] = 0.35;
        taxRates[5] = 0.405;
        taxRates[6] = 0.445;
    }

    @Override
    public void iniTax() {
        taxBrackets = new int[6];
        taxBrackets[0] = 45414;
        taxBrackets[1] = 2216;
        taxBrackets[2] = 43199;
        taxBrackets[3] = 4430;
        taxBrackets[4] = 53408;
        taxBrackets[5] = 62704;
    }
}
