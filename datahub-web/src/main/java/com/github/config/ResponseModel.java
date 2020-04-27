package com.github.config;

import lombok.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 * @author 谢森
 * @date 2020/4/25 18:03
 */
@ToString
@AllArgsConstructor
@Getter
@Setter
public class ResponseModel<T> implements Serializable {
    private static final long serialVersionUID = 3237823422179400161L;
    
    private int status;
    private T result;
    private String message;
    private String code;

    public ResponseModel() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getResponse();
        response.setCharacterEncoding("UTF-8");
    }
}
