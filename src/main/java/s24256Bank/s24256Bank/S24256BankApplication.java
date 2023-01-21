package s24256Bank.s24256Bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class S24256BankApplication {

	private final BankService bankService;

	public S24256BankApplication(BankService bankService){

		this.bankService = bankService;
		TransactionInfo transactionInfo = bankService.makeTransaction(1,23.00);
		System.out.println(transactionInfo);
		Account account = new Account(34,"Sylwia","Kowalska",203.00);
		//Account account1 = bankService.makeAccount(account);
		List<Account> accountList = bankService.getAllAccounts();
		System.out.println(accountList);
		TransactionInfo dodaniesrodkow = bankService.addMoney(1,30.50);
		System.out.println(dodaniesrodkow);
		Account odczytaniedanych = bankService.getAccound(2);
		System.out.println(odczytaniedanych);

	}

	public static void main(String[] args) {
		SpringApplication.run(S24256BankApplication.class, args);
	}

}
