package com.csx.ssi.test;

import com.csx.ssi.dao.UserMapper;
import com.csx.ssi.entity.User;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by csx on 2016/6/28.
 */
public class testDao {


    //@Resource //这里没法使用，后继版本有其它方式可以注入
    static private UserMapper userDao;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        userDao = (UserMapper) context.getBean("userDao");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Test
    public void testSelectDept() {
        User user=new User();
        user.setEmail("csx@qq.com");
        user.setPassword("1234");
        System.out.println(userDao.login(user));
    }

    @Test
    public void testInsertDept() {
        User user = new User();
        //dept.setDeptId(117);
        user.setEmail("csx@qq.com");
        user.setPassword("1234");
        System.out.println("受影响行数：" + userDao.register(user));
    }

}
