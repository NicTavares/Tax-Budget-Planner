package ui;


import model.income.Budget;
import model.income.Income;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * @author Nic Tavares, Summer 2019
 * credits: Taxtips.ca for the tax information
 */
public class ATaxIncomeFrame extends JFrame {
    private JRadioButton bc;
    private JRadioButton ab;
    private JRadioButton ma;
    private JRadioButton sa;
    private JRadioButton qb;
    private JRadioButton on;
    private JRadioButton nfl;
    private JRadioButton ns;
    private JRadioButton nb;
    private JRadioButton nun;
    private JRadioButton nwt;
    private JRadioButton pei;
    private JRadioButton yuk;
    private ArrayList<JRadioButton> butList = new ArrayList<>();
    private JTextField input;
    private JLabel result;
    private JLabel rent;
    private JLabel savings;
    private JLabel investments;
    private JLabel food;
    private JLabel entertainment;
    private JLabel disclaimer;
    private Income pretax;
    private JButton calc;
    private ActionListener plistener;
    private ActionListener blistener;
    private ActionListener saveListener;
    private int flag = 1;
    
    
    /**
     * MODIFIES this
     * EFFECTS creates the JFrame object, sets up the actionlistener inner classes
     */
    public ATaxIncomeFrame() {
        result = new JLabel("After tax salary: ");
        disclaimer = new JLabel("(This is an estimate and does not include credits/deductions among other things)");
        class ProvinceListener implements ActionListener {
            
            @Override
            public void actionPerformed(ActionEvent event) {
                setProvince();
            }
        }

        class EnterListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                boolean wasNumeric = setPTaxIncome();
                if (wasNumeric) {
                    setATaxIncome();
                }
                setBudget();
            }
        }

        class saveListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event) {
                try {
                    PrintWriter out = new PrintWriter("Budget.txt");
                    out.println("Income: " + input.getText());
                    out.println(result.getText());
                    out.println(rent.getText());
                    out.println(savings.getText());
                    out.println(investments.getText());
                    out.println(food.getText());
                    out.println(entertainment.getText());
                    out.close();

                } catch(IOException e){
                    System.out.println("IOException occurred");
                }
            }
        }
        
        setSize(600,800);
        plistener = new ProvinceListener();
        blistener = new EnterListener();
        saveListener = new saveListener();
        createControlPanel();
    }

    /**
     * MODIFIES this
     * EFFECTS creates the main panel that will be added to the frame, then creates all the sub panels
     * and creates their details using helper methods
     */

    private void createControlPanel() {
        JPanel resultPanel = createResultsPanel();
        JPanel radioPanel = createRadioPanel();
        JPanel inputPanel = createInputPanel();
        JPanel budgetPanel = createBudgetPanel();
        JPanel savePanel = createSavePanel();
        JPanel controlPanel = new JPanel();
        
        controlPanel.setLayout(new GridLayout(5,1));
        
        controlPanel.add(inputPanel);
        controlPanel.add(radioPanel);
        controlPanel.add(resultPanel);
        controlPanel.add(budgetPanel);
        controlPanel.add(savePanel);
        
        add(controlPanel);
    }

    private JPanel createSavePanel() {
        JPanel savePanel = new JPanel();
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);
        savePanel.setPreferredSize(new Dimension(600, 25));
        savePanel.setBackground(Color.gray);
        savePanel.add(saveButton);
        return savePanel;
    }

    /**
     * MODIFIES this
     * EFFECTS adds all the buttons to the arraylist
     */
    private void addButtonsToList() {
        butList.add(ab);
        butList.add(bc);
        butList.add(ma);
        butList.add(sa);
        butList.add(qb);
        butList.add(on);
        butList.add(nfl);
        butList.add(ns);
        butList.add(nb);
        butList.add(nun);
        butList.add(nwt);
        butList.add(pei);
        butList.add(yuk);
        for(int i = 0; i < 13; i++){
            butList.get(i).setBackground(Color.gray);
        }
    }

    /**
     * MODIFIES this
     * EFFECTS adds the province listener to each of the province buttons
     */
    private void addProvListener() {
        for (int i = 0; i < 13; i++) {
            butList.get(i).addActionListener(plistener);
        }

    }

    /**
     * EFFECTS creates and returns the RadioPanel
     * @return JPanel RadioPanel
     */

    private JPanel createRadioPanel() {
        JPanel radioPanel = new JPanel();
        radioPanel.setBorder(new TitledBorder(new EtchedBorder(),"Province"));
        radioPanel.setLayout(new GridLayout(5,5));
        createRadioButtons();
        addButtonsToList();
        addProvListener();
        groupButtons();

        for (int j = 0; j < 13; j++) {
            radioPanel.add(butList.get(j));
        }
        radioPanel.setBackground(Color.gray);
        calc = new JButton("Calculate");
        calc.addActionListener(blistener);
        radioPanel.add(calc);
        
        return radioPanel;
    }

    /**
     * MODIFIES this
     * EFFECTS adds all the province buttons, adds them to a single group
     */
    private void groupButtons() {
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < 13; i++) {
            group.add(butList.get(i));
        }
    }

    /**
     * MODIFIES this
     * EFFECTS creates all the radio buttons
     */
    private void createRadioButtons() {
        bc = new JRadioButton("BC");
        ab = new JRadioButton("AB");
        ma = new JRadioButton("MA");
        sa = new JRadioButton("SK");
        qb = new JRadioButton("QC");
        on = new JRadioButton("ON");
        nfl = new JRadioButton("NL");
        ns = new JRadioButton("NS");
        nb = new JRadioButton("NB");
        nun = new JRadioButton("NU");
        nwt = new JRadioButton("NT");
        pei = new JRadioButton("PE");
        yuk = new JRadioButton("YK");
    }

    /**
     * EFFECTS creates the InputPanel
     * @return JPanel InputPanel
     */
    private JPanel createInputPanel() {
        JPanel inputPanel = new JPanel();
        inputPanel.setBorder(new TitledBorder(new EtchedBorder(),"Enter your pre-tax salary:"));
        input = new JTextField(15);
        input.addActionListener(blistener);
        inputPanel.add(input);
        inputPanel.setBackground(Color.gray);
        
        return inputPanel;
    }

    /**
     * EFFECTS sets the flag based on which button is selected
     */

    private void setProvince() {
        for (int i = 0; i < 13; i++) {
            if (butList.get(i).isSelected()) {
                flag = i + 1;
            }
        }
    }

    /**
     * MODIFIES this
     * EFFECTS initializes the Income field and catches if the input was non-numeric and displays
     * an error to the user
     */

    private boolean setPTaxIncome() {
        String income = input.getText();
        double k;

        try {
            k = Double.parseDouble(income);
            pretax = new Income(k, this.flag);
            return true;
        } catch (NumberFormatException e) {
            result.setText("Error, non-numeric input");
            result.setBackground(Color.red);
            result.setOpaque(true);
            return false;
        }
    }

    /**
     * EFFECTS sets the After tax income label to the after tax value
     */

    private void setATaxIncome() {

        result.setOpaque(false);
        result.setText("After tax salary: " + pretax.getATincome());
    }

    /**
     * EFFECTS creates the resultsPanel
     * @return JPanel resultsPanel
     */
    private JPanel createResultsPanel() {
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new GridLayout(2,1));
        resultPanel.add(result);
        resultPanel.add(disclaimer);
        resultPanel.setBackground(Color.gray);
        resultPanel.setBorder(new TitledBorder(new EtchedBorder(),"Results:"));
        return resultPanel;
    }

    /**
     * EFFECTS creates the budgetPanel and the labels for the panel
     * @return JPanel BudgetPanel
     */
    private JPanel createBudgetPanel() {
        rent = new JLabel("Rent: ");
        savings = new JLabel("Savings: ");
        investments = new JLabel("Investments: ");
        food = new JLabel("Food/Grocery: ");
        entertainment = new JLabel("Entertainment: ");

        JPanel budgetPanel = new JPanel();
        budgetPanel.setLayout(new GridLayout(5,1));
        budgetPanel.setBackground(Color.gray);
        budgetPanel.setBorder(new TitledBorder(new EtchedBorder(), "Ideal Monthly Budget"));
        budgetPanel.add(rent);
        budgetPanel.add(savings);
        budgetPanel.add(investments);
        budgetPanel.add(food);
        budgetPanel.add(entertainment);
        return budgetPanel;
    }

    /**
     * MODIFIES this
     * EFFECTS updates the Jlabels for budgeting
     */
    private void setBudget() {

        try {
            rent.setText("Rent: $" + Budget.getRent(pretax.getATincome()) + " (Maximum)");
            savings.setText("Savings: $" + Budget.getSavings(pretax.getATincome()));
            investments.setText("Investments: $" + Budget.getInvestments(pretax.getATincome()));
            food.setText("Food/Grocery: $" + Budget.getFood(pretax.getATincome()));
            entertainment.setText("Entertainment: $" + Budget.getEntertainment(pretax.getATincome()));
        } catch (Exception e) {
            System.out.println("Null Pointer Exception Occurred");
        }
    }

}
