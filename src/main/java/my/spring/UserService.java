package my.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service(value = "userServiceBean")
public class UserService {
    @Autowired
    private UserDao userDao;

    @Cacheable(cacheNames = "username")
    public String getUsernameById(int UserId){
        return userDao.getUsernameById(UserId);
    }
}
