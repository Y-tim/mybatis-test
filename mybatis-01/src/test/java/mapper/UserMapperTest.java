package mapper;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import util.MybatisUtil;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author ylx
 *  2022/2/15 14:28
 */
public class UserMapperTest {

    @Test
    public void getUserList() {
        SqlSession sqlSession = MybatisUtil.sqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}