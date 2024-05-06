package com.codigo.ramirezdelama.infraestructure.redis;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class RedisService {
    private final StringRedisTemplate stringRedisTemplate;

    public RedisService(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void saveInRedis(String key, String value, int expireTime) {
        stringRedisTemplate.opsForValue().set(key, value);
        stringRedisTemplate.expire(key, expireTime, TimeUnit.MINUTES);
    }
    public String getFromRedis(String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }


}
