package com.springmvc.dao;

import com.springmvc.entity.Message;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class MessageMapperTest {

     private ApplicationContext applicationContext;
     @Autowired
     private MessageMapper mapper;
     @Before
     public void setUp() throws Exception {
          applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
          mapper = applicationContext.getBean(MessageMapper.class);
     }

     @After
     public void tearDown() throws Exception {
     }

     @Test
     public void insert() {
          Message message = new Message();
          message.setCommand("吃饭");
          message.setContent("睡觉");
          message.setDescription("打豆豆");
          int result = mapper.insert(message);
          System.out.println(result);
          assert (result == 1);
     }
}