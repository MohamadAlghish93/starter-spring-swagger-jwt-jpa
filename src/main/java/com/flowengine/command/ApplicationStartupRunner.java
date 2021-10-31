package com.flowengine.command;

import com.flowengine.entity.UserEntity;
import com.flowengine.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Optional;


public class ApplicationStartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    UserService userService;

    @Override
    public void run(String... args) throws Exception {
        logger.info("CLI Started !!");

        Optional<UserEntity> elem = userService.findByEmail("root@root.com");
        if (elem.isPresent()==false)
        {
            UserEntity item = new UserEntity();
            item.setEmail("root@root.com");
            item.setUserName("root");
            item.setFirstName("admin");
            item.setPassword("toor");

            userService.saveUser(item);

            logger.info("create root user !!");
        }
    }
}