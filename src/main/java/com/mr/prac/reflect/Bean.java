package com.mr.prac.reflect;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangdong on 2018/5/28.
 */
public class Bean {
    private String id;
    private String type;
    private Map<String, Object> perperties = new HashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Map<String, Object> getPerperties() {
        return perperties;
    }

    public void setPerperties(Map<String, Object> perperties) {
        this.perperties = perperties;
    }
}
