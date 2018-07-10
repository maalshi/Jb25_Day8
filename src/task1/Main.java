package task1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		Account account1 = new Account(2323, "John", "Blare", 300);
		Account account2 = new Account(2323, "John", "Blare", 300);
		Account account3 = new Account(2424, "Jane", "Blare", 400);
		
		findSameAccounts(account1, account2);
	}
	
	public static void findSameAccounts(Account account1, Account account2){
		if(account1.equals(account2)){
			System.out.println("Same accounts");
		}else {
			System.out.println("Not the same accounts");
		}
	}

}
