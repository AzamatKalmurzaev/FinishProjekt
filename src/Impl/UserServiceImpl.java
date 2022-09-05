package Impl;

import Dao.UserDao;
import Service.UserService;
import company.MyExeption;
import model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao userDao = new UserDao();

    @Override
    public void UserlerdiKoshuu(User user) {
        List<User> users = userDao.getUsers();
        users.add(user);

    }

    @Override
    public User IDmenenTabuu(int id) {
        return userDao.getUsers()
                .stream()
                .filter(user -> user.getId()==id)
                .findFirst()
                .orElseThrow(() -> new MyExeption("Mynday ID jok"));
    }

    @Override
    public void IDmenenOchuru(int id) {

        try{
            User user1 = userDao.getUsers()
                    .stream()
                    .filter(user -> user.getId() == id)
                    .findFirst()
                    .orElseThrow(()-> new MyExeption("Etot ID ne naiden"));
            userDao.getUsers().remove(user1);
        }catch (MyExeption a){
            System.out.println(a.getMessage());
        }

    }

    @Override
    public void BardykUserlerdiAluu() {
        userDao.getUsers().stream()
                .forEach(System.out::println);

    }
}
