package oop.lab04.bank.nnltvnnk;

public class StrictBankAccount implements BankAccount{
    private static final int ATM_TRANSACTION_FEE = 1;
	private final int userID;
    private double balance;
    private int nTransactions;

    public StrictBankAccount(final int id, double initialBalance){
        this.userID = id;
        this.balance = initialBalance;
        this.nTransactions = 0;
    }

    /*
     * Si aggiungano selettori per: 
     * - ottenere l'id utente del possessore del conto
     * - ottenere il numero di transazioni effettuate
     * - ottenere l'ammontare corrente del conto.
     */
    public int getUserID(){
        return this.userID;
    }

    public int getNTransactions(){
        return this.nTransactions;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto Nota: il deposito va a buon fine solo se l'id utente
         * corrisponde
         */
        if(this.checkUser(usrID)){
            this.nTransactions++;
            this.balance += amount;
        }else{
            System.out.println("Wrong user id.");
        }
    }

    public void withdraw(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount al totale del
         * conto. Note: - Il conto puo' andare in rosso (ammontare negativo) -
         * Il prelievo va a buon fine solo se l'id utente corrisponde
         */
        if(this.checkUser(usrID)){
            this.nTransactions++;
            this.balance -= amount;
        }else{
            System.out.println("Wrong user id.");
        }
    }

    public void depositFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e aggiunge amount al totale del
         * conto detraendo le spese (costante ATM_TRANSACTION_FEE) relative
         * all'uso dell'ATM (bancomat) Nota: il deposito va a buon fine solo se
         * l'id utente corrisponde
         */
        if(this.checkUser(usrID)){
            this.nTransactions++;
            this.balance -= ATM_TRANSACTION_FEE;
            this.balance += amount;
        }else{
            System.out.println("Wrong user id.");
        }
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        /*
         * Incrementa il numero di transazioni e rimuove amount + le spese
         * (costante ATM_TRANSACTION_FEE) relative all'uso dell'ATM (bancomat)
         * al totale del conto. Note: - Il conto puo' andare in rosso (ammontare
         * negativo) - Il prelievo va a buon fine solo se l'id utente
         * corrisponde
         */
        if(this.checkUser(usrID)){
            this.nTransactions++;
            this.balance -= ATM_TRANSACTION_FEE;
            this.balance -= amount;
        }else{
            System.out.println("Wrong user id.");
        }
    }

    /* Utility method per controllare lo user */
    private boolean checkUser(final int id) {
        return this.userID == id;
    }

    public void chargeManagementFees(int usrID){

    }

}
