package andy.cipher.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * Description:
 *
 * @author Andy Lv
 * @date 2019/6/26 23:45
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class DataSourceConfigTest {

    @Autowired
    DataSourceConfig dataSourceConfig;

    @Test
    public void testUserName() {
        assertEquals("dev-andy-db-user", dataSourceConfig.getUsername());
    }

    @Test
    public void testPassword() {
        assertEquals("dev-andy-db-password", dataSourceConfig.getPassword());
    }
}
