package fr.afpa.account;

/**
 * Classe principale du projet, contient la fonction "main"
 */
class AccountMain
{
	public static void main(String[] args) 
	{
		System.out.println("\n----- Exercice de programmation objet - classes \"Account\" & \"Customer\" -----");

		// TODO instancier des objets de la classe "Account"
		Account account1 = new 	Account("FR1420041010050500013M02606", 3000, 0);
		Account account2 = new 	Account("FR1420041010050500013M02606", 5000, 0);
		Account account3 = new 	Account("FR1420041010050500013M02606", 2000, 0);
		Account account4 = new 	Account("FR1420041010050500013M02606", 999999, 0);

		// TODO instancier des objets de la classe "Customer"
		Customer customer1 = new Customer(1, "Jean", "Dujardin");
		Customer customer2 = new Customer(2, "Fabrice", "Eboue");
		Customer customer3 = new Customer(3, "Emmanuel", "Macron");
		
		// TODO ajouter un ou plusieurs objet de "Account" à des "Customer"
		customer1.addAccount(account1);
		customer2.addAccount(account2);
		customer3.addAccount(account3);
		customer3.addAccount(account4);
		customer3.removeAccount(account4);

		// Test de la méthode checkIban
        System.out.println("Test du format IBAN valide : " + Account.checkIban("FR1420041010050500013M02606")); // devrait retourner true
        System.out.println("Test du format IBAN invalide : " + Account.checkIban("FRXXINVALIDIBAN00013M02606")); // devrait retourner false
        System.out.println("Test du format IBAN trop court : " + Account.checkIban("FR1420AB")); // devrait retourner false
        System.out.println("Test du format IBAN trop long : " + Account.checkIban("FR1420041010050500013M0260600000000000000")); // devrait retourner false

		// Test des fonctions addMoney(), removeMoney(), transfer(), addAccount(), removeAccount()
		Account.checkIban("FRINVALIDE1010050500013M02606");
		System.out.println("Valeur account1 avant addMoney : " + account1.getBalance());
		account1.addMoney(1000);
		System.out.println("Valeur account1 après addMoney : " + account1.getBalance());
		account1.removeMoney(1000);
		System.out.println("Valeur account1 après removeMoney :" + account1.getBalance());
		System.out.println("Valeur account1 et account2 avant transfer : " + account1.getBalance() + " & " + account2.getBalance());
		account1.transfer(account2, 1000);
		System.out.println("Valeur account1 et account2 après transfer : " + account1.getBalance() + " & " + account2.getBalance());
		System.out.println("Affichage des comptes du customer1 avant addAccount : " + customer1.getAccounts());
		customer1.addAccount(account2);
		System.out.println("Affichage customer1 après addAccount : " + customer1.getAccounts());
		customer1.removeAccount(account2);
		System.out.println("Affichage customer 1 après removeAccount : " + customer1.getAccounts());


		// TODO afficher les informations des employés avec System.out.println
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
	}
}

 