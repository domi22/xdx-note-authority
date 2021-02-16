package xdx.note.authority.controller;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xdx.note.authority.mapper.DataSourceMapper;
import java.util.List;

@RestController
@RequestMapping("/t")
public class TestController {

    @Autowired
    private RedissonClient redissonClient;

    @Autowired
    private DataSourceMapper dataSourceMapper;

    @GetMapping("/d")
    public List<String> get() {
        System.out.println("12121");
        List<String> user = dataSourceMapper.getUser();
        System.out.println("12121");
        return user;
    }

    @GetMapping("/set")
    public String set(@RequestParam("key")String key, @RequestParam("value")String value) {
        RBucket<Object> bucket = redissonClient.getBucket(key);
        bucket.set(value);
        return key+ " " + value;
    }

    @GetMapping("/get")
    public String set(@RequestParam("key")String key) {
        RBucket<String> bucket = redissonClient.getBucket(key);
        return bucket.get();
    }


}
