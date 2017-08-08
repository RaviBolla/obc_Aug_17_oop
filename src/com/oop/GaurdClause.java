package com.oop;

/**
 * Created by ravibol on 8/7/17.
 */
public class GaurdClause {

    boolean isDead, isSeparated, isRetired;

    public double getPayAmount() {
        double result;
        if (isDead){
            result = deadAmount();
        }
        else {
            if (isSeparated){
                result = separatedAmount();
            }
            else {
                if (isRetired){
                    result = retiredAmount();
                }
                else{
                    //dosomething
                    result = 10;
                }
            }
        }
        return result;
    }

    public double getPayAmountGaurd() {
        if (isDead) return deadAmount();
        if (isSeparated) return separatedAmount();
        if (isRetired) return retiredAmount();
        //dosomething
        return 10;
    }

    private double separatedAmount() {
        return 0;
    }

    private double retiredAmount() {
        return 0;
    }

    private double deadAmount() {
        return 0;
    }


}
