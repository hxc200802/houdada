package com.xiayu.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Description:
 *
 * @version v1.0.0
 * @Author xiayu
 * @Date 2020/11/3 19:36
 */
@Configuration
public class SpringBootResourceConfiguration {
    @Bean
    //加密策略
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
