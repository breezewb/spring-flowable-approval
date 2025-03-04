package com.breeze.framework.config;

import com.breeze.framework.config.properties.EncryptorProperties;
import com.breeze.framework.manager.EncryptorManager;
import com.breeze.framework.encrypt.MybatisDecryptInterceptor;
import com.breeze.framework.encrypt.MybatisEncryptInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 加解密配置
 */
@Configuration
@ConditionalOnProperty(value = "mybatis-encryptor.enable", havingValue = "true")
public class EncryptorConfig {

    @Autowired
    private EncryptorProperties properties;

    @Bean
    public EncryptorManager encryptorManager() {
        return new EncryptorManager();
    }

    @Bean
    public MybatisEncryptInterceptor mybatisEncryptInterceptor(EncryptorManager encryptorManager) {
        return new MybatisEncryptInterceptor(encryptorManager, properties);
    }

    @Bean
    public MybatisDecryptInterceptor mybatisDecryptInterceptor(EncryptorManager encryptorManager) {
        return new MybatisDecryptInterceptor(encryptorManager, properties);
    }
}
