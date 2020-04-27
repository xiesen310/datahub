package com.github.common.base;

/**
 * @author 谢森
 * @date 2020/4/25 15:40
 */
public class BusinessException extends Exception {

    private static final long serialVersionUID = -5683953209277696811L;

    public BusinessException(String message) {
        super(message);
    }
}
