package com.zhaochong.springdemo.dto;

import java.util.HashMap;
import java.util.Map;

public class EISResult extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public EISResult() {
        this.put((String)"code", 200);
    }

    public static EISResult error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static EISResult error(String msg) {
        return error(500, msg);
    }

    public static EISResult error(int code, String msg) {
        EISResult r = new EISResult();
        r.put((String)"httpcode", code);
        r.put((String)"httpmsg", msg);
        return r;
    }

    public static EISResult ok(String msg) {
        EISResult r = new EISResult();
        r.put((String)"httpmsg", msg);
        return r;
    }

    public static EISResult ok(Map<String, Object> map) {
        EISResult r = new EISResult();
        r.putAll(map);
        return r;
    }

    public static EISResult ok() {
        return new EISResult();
    }

    public EISResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}