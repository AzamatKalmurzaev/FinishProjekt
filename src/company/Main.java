package company;


import Impl.UserServiceImpl;
import model.User;

public class Main {

    public static void main (String[] args) {

        User user = new User(1, "Boris", 30, Gender.MAN);
        User user1 = new User(2, "Anna", 18, Gender.WOMAN);
        User user2 = new User(3, "Talant", 22, Gender.MAN);

        UserServiceImpl userService = new UserServiceImpl();
        userService.UserlerdiKoshuu(user);
        userService.UserlerdiKoshuu(user1);
        userService.UserlerdiKoshuu(user2);

        System.out.println("ID menen aluu");

    try {
        System.out.println(userService.IDmenenTabuu(4));
    }catch (MyExeption a){
        System.out.println(a.getMessage());
    }
        System.out.println("ID menen ochyryy");
    userService.IDmenenOchuru(5);
    userService.BardykUserlerdiAluu();
    }
}
