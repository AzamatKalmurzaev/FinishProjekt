package Service;

import model.User;

public interface UserService {

    void UserlerdiKoshuu (User user);

    User IDmenenTabuu (int id);

    void IDmenenOchuru( int id);

    void BardykUserlerdiAluu();
}
