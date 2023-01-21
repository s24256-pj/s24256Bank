package s24256Bank.s24256Bank;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountStorage {

    private List<Account> accountList;
    public AccountStorage(){
        this.accountList = List.of(
                new Account(1,"Przemek","Kowalski",2065.40),
                new Account(2,"Eliza","Sto",30.23),
                new Account(3,"Karolina","Rolka",68342.34),
                new Account(4,"Darek","Wrotka",3245.90),
                new Account(5,"Iwona","Parasol",23451.99)
                );
    }

    public List<Account> getAccountList(){return accountList;}

    public Account rejestracjaKlienta(Account account){
        this.accountList.add(account);
        return account;
    }

    public Account getAccountById(int id){
        for (Account account: this.accountList){
            if(account.getId() == (id)) {
                return account;
            }
        }
        return null;
    }

    public boolean isAccountExist(int id){
        for(Account account: this.accountList){
            if(account.getId() == id){
                return true;
            }
        }
        return false;
    }


}
