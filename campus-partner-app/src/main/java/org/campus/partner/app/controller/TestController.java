package org.campus.partner.app.controller;

import org.campus.partner.dao.UserMapper;
import org.campus.partner.pojo.po.mysql.tables.pojos.User;
import org.campus.partner.util.id.IdGenerator;
import org.campus.partner.util.redis.RedisMapper;
import org.campus.partner.util.string.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    IdGenerator idGenerator;
    @Autowired
    RedisMapper redisMapper;
    @Autowired
    UserMapper userMapper;

    @GetMapping("/test/{string}")
    public String test(@PathVariable String string) {
        String id = idGenerator.getId();
        User userInfo = new User();
        userInfo.setObjectId(id.getBytes());
        userInfo.setNickname(string);
        userInfo.setPhone("111222333");
        userInfo.setQq("22222");
        userMapper.insertUser(userInfo);
        return JsonConverter.encodeAsString(userMapper.selectUserByOid(id.getBytes()));
    }

}
