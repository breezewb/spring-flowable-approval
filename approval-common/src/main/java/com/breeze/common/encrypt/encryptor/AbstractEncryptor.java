package com.breeze.common.encrypt.encryptor;

import com.breeze.common.encrypt.EncryptContext;
import com.breeze.common.encrypt.IEncryptor;

/**
 * 所有加密执行者的基类
 */
public abstract class AbstractEncryptor implements IEncryptor {

    public AbstractEncryptor(EncryptContext context) {
        // 用户配置校验与配置注入
    }

}
