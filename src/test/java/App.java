import com.hzh.mvc.entity.User;
import com.hzh.mvc.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:spring/applicationContext.xml")
public class App {
    @Autowired
    private UserService userService;
    @Test
    public void testList(){
        List<User> users = userService.listUsers();
        for (User user : users) {
            System.out.println("user = " + user);
        }
    }
}
