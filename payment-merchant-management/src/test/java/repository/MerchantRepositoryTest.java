package repository;

import com.zalopay.merchant.PaymentMerchantApplication;
import com.zalopay.merchant.constant.merchant.BusinessType;
import com.zalopay.merchant.constant.merchant.State;
import com.zalopay.merchant.entity.Merchant;
import com.zalopay.merchant.repository.MerchantRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = PaymentMerchantApplication.class)
public class MerchantRepositoryTest {

    @Autowired
    private MerchantRepository merchantRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Test
    public void testGetByEmail(){
        Merchant createdMerchant = createData();
        Merchant findByEmailMerchant = merchantRepository.getByEmail("test");
        Assertions.assertEquals(createdMerchant.getId(), findByEmailMerchant.getId());
    }

    private Merchant createData(){
        Merchant merchant = Merchant
                .builder()
                .id(UUID.randomUUID())
                .email("test")
                .name("test")
                .password(passwordEncoder.encode("123456"))
                .address("test")
                .phoneNumber("0123456")
                .taxCode("test")
                .businessType(BusinessType.ONLINE_SALE)
                .state(State.INACTIVE)
                .build();
        return merchantRepository.save(merchant);
    }

}
