package s24256Bank.s24256Bank;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BankService {

    private final AccountStorage accountStorage;

    public BankService(AccountStorage accountStorage){
        this.accountStorage = accountStorage;
    }

    public Account makeAccount(Account account){
        return accountStorage.rejestracjaKlienta(account);
    }

    public Account getAccound(int id){
        return accountStorage.getAccountById(id);
    }

    public List<Account> getAllAccounts(){
        return accountStorage.getAccountList();
    }

    public boolean isAccountExist(int id){
        return accountStorage.isAccountExist(id);
    }

    public TransactionInfo addMoney(int id,double kwota){
        Account account = accountStorage.getAccountById(id);

        if(accountStorage.isAccountExist(id)){
            double saldo = account.getSaldo();
            double finishedsaldo = saldo + kwota;
            account.setSaldo(finishedsaldo);

            System.out.println("ŚRODKI DODANE DO KONTA");
            return new TransactionInfo(finishedsaldo,TransactionStatus.ACCEPTED);
        }
        else{
            System.out.println("KONTO NIE ISTNIEJE: NIE MOZNA DODAC SRODKÓW");
            return new TransactionInfo(0,TransactionStatus.DECLINE);
        }

    }

    public TransactionInfo makeTransaction(int id,double kwota){
        Account account = accountStorage.getAccountById(id);

        if(accountStorage.isAccountExist(id) && kwota < account.getSaldo()){
                double saldo = account.getSaldo();
                double finishedsaldo = saldo - kwota;
                account.setSaldo(finishedsaldo);

                System.out.println("PRZELEW UDANY ŚRODKÓW JUŻ NIE MA NA KONCIE");
                return new TransactionInfo(finishedsaldo,TransactionStatus.ACCEPTED);
        }
        else if(accountStorage.isAccountExist(id) && kwota > account.getSaldo()){
            double saldo = account.getSaldo();
            System.out.println("NIE MASZ WYSTARCZAJACYCH SRODKÓW NA KONCIE");
            return new TransactionInfo(saldo,TransactionStatus.DECLINE);
        }
        else{
            System.out.println("KONTO NIE ISTNIEJE NIE MOZESZ PRZESLAC SRODKOW");
            return new TransactionInfo(0,TransactionStatus.DECLINE);
        }

    }
}
