package oop.lab03.bank;

public final class TestSimpleBankAccount {

/*    private TestSimpleBankAccount() { }
*/
    public static void main(final String[] args) {
        /*
         * 1) Creare l' AccountHolder relativo a Mario Rossi con id 1 
         * 
         * 2) Creare l' AccountHolder relativo a Luigi Bianchi con id 2 
         * 
         * 3) Creare i due SimpleBankAccount corrispondenti 
         * 
         * 4) Effettuare una serie di depositi e prelievi 
         * 
         * 5) Stampare a video l'ammontare dei due conti e verificare la correttezza del risultato 
         * 
         * 6) Provare a prelevare fornendo un idUsr sbagliato 
         * 
         * 7) Controllare nuovamente l'ammontare
         */
        AccountHolder ah1 = new AccountHolder("Mario", "Rossi", 1);
        AccountHolder ah2 = new AccountHolder("Luigi", "Bianchi", 2);

        SimpleBankAccount ba1 = new SimpleBankAccount(1, 120.00);
        SimpleBankAccount ba2 = new SimpleBankAccount(2, 1200.00);

        System.out.println("Deposito: User ID 1, amount 100.00");
        ba1.deposit(1, 100.00);
        System.out.println("Deposito: User ID 1, amount 10.00");
        ba1.deposit(1, 10.00);
        System.out.println("Withdrawal: User ID 1, amount 10.00");
        ba1.withdraw(1, 10.00);


        System.out.println("ATM Withdrawal: User ID 1, amount 230.00");
        ba1.withdrawFromATM(1, 230.00);

        System.out.println(ah1.toString());
        System.out.println("Balance: " + ba1.getBalance());
        System.out.println("Number of transactions: "+ ba1.getNTransactions());
        System.err.println("");

        System.out.println("Deposito: User ID 3, amount 100.00");
        ba1.deposit(3, 100.00);
    }
}
