package fr.afpa.account;

/**
 * Classe représentant un compte bancaire
 */
public class Account {    
    // TODO à compléter

    // Attributs
    private String iban;
    private int balance; //argent sur le compte
    private int overdraftAuthorization; //découvert autorisé
    
    // Constructeur
    public Account(String iban, int balance, int overdraftAuthorization) {
        this.iban = iban;
        this.balance = balance;
        this.overdraftAuthorization = overdraftAuthorization;
    }

    // Getters
    public String getIban() {
        return iban;
    }

    public int getBalance() {
        return balance;
    }

    public int getOverdraftAuthorization() {
        return overdraftAuthorization;
    }

    // Setters
    public void setIban(String iban) {
        if(!checkIban(iban)){
            throw new IllegalArgumentException("L'IBAN n'est pas au bon format");
        }
        this.iban = iban;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setOverdraftAuthorization(int overdraftAuthorization) {
        this.overdraftAuthorization = overdraftAuthorization;
    }

    // toString()
    @Override
    public String toString() {
        return "Account [iban=" + iban + ", balance=" + balance + ", overdraftAuthorization=" + overdraftAuthorization
                + "]";
    }

    // Méthode pour vérifier le format de l'iban
    public static boolean checkIban(String iban) {
        return iban.matches("^[A-Za-z]{2}\\d{2}[A-Za-z0-9]{10,30}$");
    }

    // Méthode pour ajouter de l'argent
    public int addMoney(int amount){
        return this.balance += amount;
    }

    // Méthode pour soustraire de l'argent
    public int removeMoney(int amount){
        return this.balance -= amount;
    }

    // Méthode de transfert d'argent
    public void transfer(Account otherAccount, int amount){      
        if (this.balance >= amount){
            this.balance -= amount;
            otherAccount.setBalance(otherAccount.getBalance() + amount);
        } else {
            System.out.println("Solde insuffisant pour effectuer le transfert.");
        }
    }
}
