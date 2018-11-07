package my.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String getUsernameById(int UserId){
        String sql = "select username from user where userId = ?";
        return jdbcTemplate.queryForObject(sql,new Object[]{UserId},String.class);
    }
}
