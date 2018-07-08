import Impl.UserDaoImpl;
import domain.User;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class SqlMyBatisXmlTest {
    private static Logger logger = Logger.getLogger(SqlMyBatisXmlTest.class);

    //测试遍历数据
    @Test
    public void testFindAllUser() throws Exception {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        List<User> findAllUser = userDaoImpl.findAllUsers();
        System.out.println ("----Find All User-----" );
        for (User user2 : findAllUser) {
            System.out.println(user2);
        }
        System.out.println ("----Find All Use Successfully-----" );
    }

    //测试插入数据(第一组)
    @Test
    public void testInsertUser() throws Exception {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = new User();
        System.out.println ("---- Insert User----" );
        user.setId ( 6 );
        user.setName("FF");
        user.setEmp("网络工程师");
        user.setSalary(8954.69);
        userDao.insertUser(user);
        System.out.println ("----Insert User Successfully ----" );
    }

    //测试通过ID获取数据信息
    @Test
    public void testFindUserByID() throws Exception {
        UserDaoImpl userDaoImpl = new UserDaoImpl ();
        System.out.println ("----Find user from tables by id=----" );
        User user = userDaoImpl.findUserById(3);
        System.out.println(user);
        System.out.println ("----Find user successfully-----" );
    }

    //测试根据ID删除相应的数据
    @Test
    public void testDeleteUser() throws Exception{
        UserDaoImpl userDao = new UserDaoImpl();
        System.out.println ("----Delete user data by id----" );
        userDao.deleteUserById(2);
        System.out.println ("----Delete successfully -----" );
    }

    //测试根据ID更新数据
    @Test
    public void testUpdateUser() throws Exception{
        UserDaoImpl userDao = new UserDaoImpl();
        User user = new User();
        System.out.println ("----Update user data by id----" );
        user.setId(1);
        user.setEmp("策划部经理");
        user.setSalary(68540.54);
        userDao.updateUserEmp(user);
        System.out.println ("----Update successfully-----" );
    }

}
