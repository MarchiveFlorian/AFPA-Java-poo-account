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
}
