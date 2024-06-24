package fr.afpa.account;

import java.util.ArrayList;

/**
 * Classe qui représente un client, propriétaire de comptes bancaires
 */
public class Customer {

    // TODO compléter la classe

    // Attributs
    private int id;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accounts;
    
    // Constructeur
    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public ArrayList<Account> getAccounts(){
        return accounts;
    }
    
    // Setters
    public void setId(int id) {
        this.id = id;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setAccounts(ArrayList<Account> accounts){
        this.accounts = accounts;
    }
    
    // to String
    @Override
    public String toString() {
        return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", accounts=" + accounts
                + "]";
    }
    
    // Méthode pour ajouter un compte
    public void addAccount(Account account){
        accounts.add(account);
        System.out.println("Ajout du compte : " + account.getIban());
    }
    
    // Méthode pour supprimer un compte
    public void removeAccount(Account account){
        accounts.remove(account);
        System.out.println("Suppression du compte : " + account.getIban());
    }
}
