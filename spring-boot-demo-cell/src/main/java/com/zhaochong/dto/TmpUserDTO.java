package com.zhaochong.dto;

import com.zhaochong.entity.TmpTag;
import com.zhaochong.entity.TmpUser;

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
