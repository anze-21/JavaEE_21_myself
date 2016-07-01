package com.kaishengit.dao;

import com.kaishengit.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ApplicationContext.xml")
public class UserDaoTestCase {
   @Inject
   private UserDao userDao;
    @Test
    public void testSave(){
        User user =new User();
        user.setUsername("Jame");
        user.setPassword("sss");
        user.setAddress("China");
        userDao.save(user);

    }
    @Test
    public void testFindById(){
        User user=userDao.findById(12);
        Assert.assertNotNull(user);
        System.out.println(user);

    }
    @Test
    public void testFindByName(){
        User user=userDao.findByName("Jame");
        Assert.assertNotNull(user);
    }
    @Test
    public void testFindAll(){
        List<User> userList=userDao.findAll();
        for(User user:userList){
            System.out.println(user);
        }


    }
    @Test
    public void testCount(){
        Long count=userDao.count();
        Assert.assertEquals(count.byteValue(),8);

    }
    @Test
    public void testDel(){
        userDao.del(12);
        Assert.assertEquals(userDao.count().byteValue(),7);

    }

}
