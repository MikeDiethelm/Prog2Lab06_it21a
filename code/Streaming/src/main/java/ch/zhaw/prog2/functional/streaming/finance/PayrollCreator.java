package ch.zhaw.prog2.functional.streaming.finance;

import ch.zhaw.prog2.functional.streaming.Company;

import java.util.List;

/**
 * This Class creates a Payroll (Lohabrechnung) for a whole Company 
 * and supplies some Utility Methods for a a Payroll. 
 * ✅  This class should be worked on by students. 
 */
public class PayrollCreator {
    private final Company company;

    /**
     * Opens a Payroll for a company. 
     * @param company
     */
    public PayrollCreator(Company company) {
        this.company = company;
    }

    /*
     * Aufgabe d) - Test dazu exisitert in PayrollCreatorTest
     */
    public Payroll getPayrollForAll() {
        return new Payroll();
    }

    /*
     * Aufgabe e) - Test dazu existiert in PayrollCreatorTest
     */
    public static int payrollValueCHF(Payroll payroll) {
        return 0;
    }

    /** 
     * Aufgabe f) - schreiben Sie einen eigenen Test in PayrollCreatorTestStudent
     * @return a List of total amounts in this currency for each currency in the payroll 
     */
    public static List<CurrencyAmount> payrollAmountByCurrency(Payroll payroll) {
        return null;
    }


}
