package com.zhaochong.exception;

import com.zhaochong.constant.Status;
import lombok.Getter;

/**
 * <p>
 * 页面异常
 * </p>

 */
@Getter
public class PageException extends BaseException {

	public PageException(Status status) {
		super(status);
	}

	public PageException(Integer code, String message) {
		super(code, message);
	}
}
