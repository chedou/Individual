package Impl;

import dao.UserDao;
import domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class UserDaoImpl implements UserDao {
    public User findUserById(int id) throws Exception {
        String resource = "SqlMapperMybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder ().build(inputStream);
        SqlSession session = factory.openSession();
        //---------------
        //参数一：namespace.id。user.findUserById是配置文件User.xml中mapper的ID
        User user = session.selectOne("user.findUserById",id);
        //--------------
        session.close();
        return user;
    }

    public List<User> findAllUsers() throws Exception {
        String resource = "SqlMapperMybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        //---------------------
        //user.findUserAll 是配置文件 user.xml中mapper的ID
        List<User> users = session.selectList("user.findUserAll");
        //----------------------
        session.close();
        return users;    }

    public void insertUser(User user) throws Exception {
        String resource = "SqlMapperMybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        //---------------------
        //user.insertUser 是配置文件 user.xml中mapper的ID
        session.insert("user.insertUser", user);
        session.commit();   //增删改，需加上commit操作
        //----------------------
        session.close();

    }

    public void deleteUserById(int id) throws Exception {
        String resource = "SqlMapperMybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        //---------------------
        //user.deleteUserById 是配置文件 user.xml中mapper的ID
        session.delete("user.deleteUserById", id);
        session.commit();   //增删改，需加上commit操作
        //----------------------
        session.close();


    }

    public void updateUserEmp(User user) throws Exception {
        String resource = "SqlMapperMybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        //---------------------
        //user.updateUserEmp 是配置文件 user.xml中mapper的ID
        session.update("user.updateUserEmp", user);
        session.commit();   //增删改，需加上commit操作
        //----------------------
        session.close();

    }
}
