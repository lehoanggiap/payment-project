package service;

import com.zalopay.merchant.dto.MerchantDTO;
import com.zalopay.merchant.entity.Merchant;
import com.zalopay.merchant.mapper.MerchantMapper;
import com.zalopay.merchant.repository.MerchantRepository;
import com.zalopay.merchant.service.impl.MerchantServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MerchantServiceTest {

    @InjectMocks
    MerchantServiceImpl merchantService;

    @Mock
    MerchantRepository merchantRepository;

    @Mock
    MerchantMapper merchantMapper;

    @Test
    public void saveMerchantSuccessfully() {
        String email = "test";
        Mockito.when(merchantRepository.getByEmail(email)).thenReturn(null);
        Merchant merchant = Merchant.builder().build();
        Mockito.when(merchantRepository.save(Mockito.any(Merchant.class))).thenReturn(merchant);
        MerchantDTO merchantDTO = MerchantDTO.builder().email(email).build();
        Mockito.when(merchantMapper.toEntity(merchantDTO)).thenReturn(merchant);
        merchantService.save(merchantDTO);
        Mockito.verify(merchantRepository, Mockito.times(1)).save(merchant);
    }

    @Test
    public void saveMerchantUnsuccessfully_DueToEntityDuplicatedEmail() {
        String email = "test";
        Merchant merchant = Merchant.builder().email(email).build();
        Mockito.when(merchantRepository.getByEmail(email)).thenReturn(merchant);
        MerchantDTO merchantDTO = MerchantDTO.builder().email(email).build();
        merchantService.save(merchantDTO);
        Mockito.verify(merchantRepository, Mockito.times(0)).save(merchant);
    }

}
