import model.income.Budget;
import model.income.Income;
import model.provinces.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Testing {

    @Test
    public void testing() {
        ProvinceTax bc = new BcTax(300000);
        ProvinceTax ab = new AbTax(300000);
        ProvinceTax ma = new MaTax(300000);
        ProvinceTax nb = new NbTax(300000);
        ProvinceTax nfl = new NflTax(300000);
        ProvinceTax ns = new NsTax(300000);
        ProvinceTax nun = new NuNTax(300000);
        ProvinceTax nwt = new NwTTax(300000);
        ProvinceTax on = new OnTax(300000);
        ProvinceTax pe = new PeiTax(300000);
        ProvinceTax qb = new QbTax(300000);
        ProvinceTax sa = new SaTax(300000);
        ProvinceTax yk = new YkTax(300000);
        assertTrue ((int) bc.getAT() == 182226);
        assertTrue ((int) ab.getAT() == 186002);
        assertTrue ((int) ma.getAT() == 173424);
        assertTrue ((int) nb.getAT() == 170123);
        assertTrue ((int) nfl.getAT() == 173709);
        assertTrue ((int) ns.getAT() == 167490);
        assertTrue ((int) nun.getAT() == 194169);
        assertTrue ((int) nwt.getAT() == 186419);
        assertTrue ((int) on.getAT() == 174879);
        assertTrue ((int) pe.getAT() == 171381);
        assertTrue ((int) qb.getAT() == 164918);
        assertTrue ((int) sa.getAT() == 181692);
        assertTrue((int) yk.getAT() == 189157);
        ProvinceTax x = new BcTax(30000);
        ProvinceTax y = new BcTax(30000);
        assertTrue (x.equals(y));
        assertTrue (!x.equals(new Object()));
    }

    @Test
    public void testing2() {
        ProvinceTax bc2 = new BcTax(10000);
        ProvinceTax ab2 = new AbTax(10000);
        ProvinceTax ma2 = new MaTax(10000);
        ProvinceTax nb2 = new NbTax(10000);
        ProvinceTax nfl2 = new NflTax(10000);
        ProvinceTax ns2 = new NsTax(10000);
        ProvinceTax nun2 = new NuNTax(10000);
        ProvinceTax nwt2 = new NwTTax(10000);
        ProvinceTax on2 = new OnTax(10000);
        ProvinceTax pe2 = new PeiTax(10000);
        ProvinceTax qb2 = new QbTax(10000);
        ProvinceTax sa2 = new SaTax(10000);
        ProvinceTax yk2 = new YkTax(10000);
        ProvinceTax ykk = new YkTax(9000);
        Object a = null;

        assertFalse(ykk.equals(yk2));
        assertTrue(!bc2.equals(a));
        assertTrue ((int) bc2.getAT() == 7994);
        assertTrue ((int) ab2.getAT() == 7500);
        assertTrue ((int) ma2.getAT() == 7420);
        //System.out.println(nb2.getAT());
        assertTrue ((int) nb2.getAT() == 7532);
        //System.out.println(nfl2.getAT());
        assertTrue ((int) nfl2.getAT() == 7630);
        //System.out.println(ns2.getAT());
        assertTrue ((int) ns2.getAT() == 7621);
        //System.out.println(nun2.getAT());
        assertTrue ((int) nun2.getAT() == 8100);
        //System.out.println(nwt2.getAT());
        assertTrue ((int) nwt2.getAT() == 7910);
        //System.out.println(on2.getAT());
        assertTrue ((int) on2.getAT() == 7995);
        //System.out.println(pe2.getAT());
        assertTrue ((int) pe2.getAT() == 7520);
        //System.out.println(qb2.getAT());
        assertTrue ((int) qb2.getAT() == 7247);
        //System.out.println(sa2.getAT());
        assertTrue ((int) sa2.getAT() == 7450);
        //System.out.println(yk2.getAT());
        assertTrue ((int) yk2.getAT() == 7860);

    }

    @Test
    public void testing3(){
        Income i1 = new Income(10000.0, 1);
        Income i2 = new Income(10000.0, 2);
        Income i3 = new Income(10000.0, 3);
        Income i4 = new Income(10000.0, 4);
        Income i5 = new Income(10000.0, 5);
        Income i6 = new Income(10000.0, 6);
        Income i7 = new Income(10000.0, 7);
        Income i8 = new Income(10000.0, 8);
        Income i9 = new Income(10000.0, 9);
        Income i10 = new Income(10000.0, 10);
        Income i11 = new Income(10000.0, 11);
        Income i12 = new Income(10000.0, 12);
        Income i13 = new Income(10000.0, 13);
        Income i14 = new Income(10000.0, 13);
        Income i15 = new Income(10000.0,14);
        Income i16 = new Income(7000.0, 14);
        Object a = null;

        assertFalse(i16.equals(i15));
        assertFalse(i13.equals(i10));
        assertTrue(i13.equals(i14));
        assertTrue(!i13.equals(new Object()));
        assertTrue(!i13.equals(a));
        assertTrue(i13.equals(i13));
        assertTrue(i1.getATincome().equals("7500"));
        assertTrue(i2.getATincome().equals("7994"));
        assertTrue(i3.getATincome().equals("7420"));
        assertTrue(i4.getATincome().equals("7532"));
        assertTrue(i5.getATincome().equals("7630"));
        assertTrue(i6.getATincome().equals("7621"));
        assertTrue(i7.getATincome().equals("7910"));
        assertTrue(i8.getATincome().equals("8100"));
        assertTrue(i9.getATincome().equals("7995"));
        assertTrue(i10.getATincome().equals("7520"));
        assertTrue(i11.getATincome().equals("7247"));
        assertTrue(i12.getATincome().equals("7450"));
        assertTrue(i13.getATincome().equals("7860"));
        assertTrue(i15.getATincome().equals("7500"));
    }

    @Test
    public void testing4(){
        ProvinceTax bc3 = new BcTax(-1);
        ProvinceTax ab3 = new AbTax(-1);
        ProvinceTax ma3 = new MaTax(-1);
        ProvinceTax nb3 = new NbTax(-1);
        ProvinceTax nfl3 = new NflTax(-1);
        ProvinceTax ns3 = new NsTax(-1);
        ProvinceTax nun3 = new NuNTax(-1);
        ProvinceTax nwt3 = new NwTTax(-1);
        ProvinceTax on3 = new OnTax(-1);
        ProvinceTax pe3 = new PeiTax(-1);
        ProvinceTax qb3 = new QbTax(-1);
        ProvinceTax sa3 = new SaTax(-1);
        ProvinceTax yk3 = new YkTax(-1);

        assertTrue((int)bc3.getAT() == 0);
        assertTrue((int)ab3.getAT() == 0);
        assertTrue((int)ma3.getAT() == 0);
        assertTrue((int)nb3.getAT() == 0);
        assertTrue((int)nfl3.getAT() == 0);
        assertTrue((int)ns3.getAT() == 0);
        assertTrue((int)nun3.getAT() == 0);
        assertTrue((int)nwt3.getAT() == 0);
        assertTrue((int)on3.getAT() == 0);
        assertTrue((int)pe3.getAT() == 0);
        assertTrue((int)qb3.getAT() == 0);
        assertTrue((int)sa3.getAT() == 0);
        assertTrue((int)yk3.getAT() == 0);

        assertFalse(bc3.equals(nfl3));
        assertTrue(bc3.equals(bc3));
    }

    @Test
    public void budgetTest(){
        Budget b = new Budget();
        assertTrue(Budget.getEntertainment("1000") == 12);
        assertTrue(Budget.getFood("1000") == 12);
        assertTrue(Budget.getInvestments("1000") == 20);
        assertTrue(Budget.getSavings("1000") == 12);
        assertTrue(Budget.getRent("1000") == 24);
        assertTrue(Budget.getRent("a") == (int)(-1 * 0.3));
    }

}
