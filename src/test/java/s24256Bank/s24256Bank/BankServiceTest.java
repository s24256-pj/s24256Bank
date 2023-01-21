package s24256Bank.s24256Bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BankServiceTest {

    @InjectMocks
    BankService bankService;

    @Mock
    AccountStorage accountStorage;

    @Test
    public void isAccountExist(){
        List<Account> accountList = new ArrayList<>();
        int id = 1;
        boolean accountExist = bankService.isAccountExist(id);

        assertThat(accountExist).isEqualTo(true);

    }
}
