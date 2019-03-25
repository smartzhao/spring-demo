package com.zhaochong.springdemo.dto;

import com.zhaochong.springdemo.entity.TmpTag;
import com.zhaochong.springdemo.entity.TmpUser;

import java.util.ArrayList;
import java.util.List;

public class TmpUserDTO extends TmpUser {

    private List<TmpTag> tags = new ArrayList<>();

    public List<TmpTag> getTags() {
        return tags;
    }

    public void setTags(List<TmpTag> tags) {
        this.tags = tags;
    }

}
