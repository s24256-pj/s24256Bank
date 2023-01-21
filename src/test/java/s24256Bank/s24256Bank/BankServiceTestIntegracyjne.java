package s24256Bank.s24256Bank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class BankServiceTestIntegracyjne {

    @MockBean
    AccountStorage accountStorage;

    @Autowired
    BankService bankService;

}
