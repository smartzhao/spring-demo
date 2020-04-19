package com.zhaochong.exception;

import com.zhaochong.constant.Status;
import lombok.Getter;

/**
 * <p>
 * JSON异常
 * </p>
 */
@Getter
public class JsonException extends BaseException {

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
