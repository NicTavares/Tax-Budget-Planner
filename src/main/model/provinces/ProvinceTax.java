package model.provinces;


import java.util.Objects;

/**
 *
 */
public abstract class ProvinceTax {
    protected double at = 0;
    protected double[] taxRates;
    protected int[] taxBrackets;
    private int lastElement;
    private double tax = 0;

    /**
     * MODIFIES this
     * EFFECTS initializes the arrays and and last element size
     */
    public ProvinceTax() {
        iniTax();
        iniRates();
        lastElement = taxRates.length - 1;
    }

    abstract void iniTax();

    abstract void iniRates();


    /**
     * REQUIRES a valid double value for income
     * MODIFIES this
     * EFFECTS loops through the rates array and the brackets array to calculate the after tax income
     * @param income pretax income
     * @return
     */
    protected double calcAT(double income) throws NonValidIncomeException {
        if (income < 0) {
            throw new NonValidIncomeException();
        }
        double temp = income;
        for (int i = 0; i < taxBrackets.length; i++) {
            if (temp > (double)taxBrackets[i]) {
                tax += taxBrackets[i] * taxRates[i];
                temp -= taxBrackets[i];
            } else {
                tax += temp * taxRates[i];
                temp = 0;
                break;
            }
        }
        if (temp > 0) {
            tax += temp * taxRates[lastElement];
        }
        return income - tax;
    }

    /**
     * EFFECTS returns the after tax value stored in at
     * @return at
     */
    public double getAT() {
        return at;
    }

    /**
     * EFFECTS returns true if the object is equal else false
     * @param o an object
     * @return true/false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProvinceTax provinceTax = (ProvinceTax) o;
        return Double.compare(provinceTax.at, at) == 0;
    }

}
