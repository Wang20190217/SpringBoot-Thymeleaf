package cn.curleyg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;

/**
 * 城南花已开<br>
 *
 * @Description: <br>
 * @Project: <br>
 * @CreateDate: Created in 2022/5/2 20:11 <br>
 * @Author: Wang
 */
@Configuration
public class ApplocationConfig {
    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }

}
