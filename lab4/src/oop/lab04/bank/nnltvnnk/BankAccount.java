package oop.lab04.bank.nnltvnnk;

public interface BankAccount{
    int getUserID();

    int getNTransactions();

    double getBalance();

    void deposit(int usrID, double amount);

    void withdraw(int usrID, double amount);

    void depositFromATM(int usrID, double amount);

    void withdrawFromATM(int usrID, double amount);

    void chargeManagementFees(int usrID);

}

