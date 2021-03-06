package cn.itcast.service;

import cn.itcast.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-*.xml")
public class AccountServiceTest {
    @Autowired
    private AccountService service;

    @Test
    public void transfer() {
        service.transfer("aaa","bbb",300);
    }
}