public class SimpleBankAccount implements BankAccount{
    /*
     * Aggiungere i seguenti campi:
     * - double balance: ammontare del conto
     * - int userID: id del possessore del conto (già dichiarato: si veda al riguardo il metodo checkUser dichiarato in fondo alla classe)
     * - int nTransactions: numero delle operazioni effettuate
     * - static double ATM_TRANSACTION_FEE = 1: costo delle operazioni via ATM
     */
    private static final int ATM_TRANSACTION_FEE = 1;
	private final int userID;
    private double balance;
    private int nTransactions;

    /*
     * Creare un costruttore pubblico che prenda in ingresso un intero (ossia l'id
     * dell'utente) ed un double (ossia, l'ammontare iniziale del conto corrente).
     */
    public SimpleBankAccount(final int id, double initialBalance){
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
