package dao;

import domain.User;

import java.util.List;

public interface UserDao {
    //通过ID获取用户
    public User findUserById(int id) throws Exception ;
    //查询所有的用户
    public List<User> findAllUsers() throws Exception;
    //插入用户信息
    public void insertUser(User user) throws Exception;
    //通过ID删除用户
    public void deleteUserById(int id) throws Exception;
    //更新用户信息
    public void updateUserEmp(User user) throws Exception;

}
