package model.income;

import model.provinces.*;
import java.util.Objects;

/**
 * margin tax rates taken from taxtips.ca
 * @author nictavares
 */
public class Income {
    double income;
    ProvinceTax prov;


    /**REQUIRES non negative double value, valid mark between 1 and 13
     *MODIFIES this
     * EFFECTS constructs an income object using provSetter()
     * @param income the pretax income earned
     * @param mark marker for choosing which province
     */
    public Income(Double income, int mark) {
        this.income = income;
        provSetter(income, mark);
        
    }

    /**REQUIRES a non negative double value, valid mark between 1 and 13
     *MODIFIES this
     * EFFECTS sets the provinceTAX with a newly constructed object
     * @param income the income earned
     * @param mark which province is selected
     */
    private void provSetter(double income, int mark) {
        switch (mark) {
            case 1: prov = new AbTax(income);
            break;
            case 2: prov = new BcTax(income);
            break;
            case 3: prov = new MaTax(income);
            break;
            case 4: prov = new NbTax(income);
            break;
            case 5: prov = new NflTax(income);
            break;
            case 6: prov = new NsTax(income);
            break;
            case 7: prov = new NwTTax(income);
            break;
            case 8: prov = new NuNTax(income);
            break;
            case 9: prov = new OnTax(income);
            break;
            case 10: prov = new PeiTax(income);
            break;
            case 11: prov = new QbTax(income);
            break;
            case 12: prov = new SaTax(income);
            break;
            case 13: prov = new YkTax(income);
            break;
            default: prov = new AbTax(income);
        }
    }


    /**
     *EFFECTS returns a string representing the integer portion of after tax income
     * @return
     */
    public String getATincome() {
        String tempAfterTax = "";
        tempAfterTax += prov.getAT();
        int location = tempAfterTax.indexOf('.');
        String afterTax = tempAfterTax.substring(0, location);
        return afterTax;
        
    }

    //EFFECTS returns true if the object passes is the same, otherwise false
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Income income1 = (Income) o;
        return Double.compare(income1.income, income) == 0
                && Objects.equals(prov, income1.prov);
    }
}
