package com.elakkiya.Abstraction;

import java.util.Arrays;

public abstract class Bank {

    int[] denominations = new int[]{50, 100, 200};
   Bank()
    {
        System.out.println("bank :  " + getClass());
    }
    abstract int[] printStatus();

    final double interest(){
        return 5.4;
    }

    public static void main(String[] args) {
        Bank bank1 = new SBI();
        System.out.println("SBI interest percent is  " + bank1.interest());
        Bank bank2 = new HDFC();
        System.out.println("HDFC denominations are  " + Arrays.toString(bank2.printStatus()));
        Bank bank3 = new Syndicate();
        System.out.println("Syndicate interest percent is  "+ bank3.interest());
    }
}
