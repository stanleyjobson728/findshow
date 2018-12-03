package com.megamusic.findshow.domain.entity.constant;

/**
 * Created by maita on 17/8/15.
 * 资源位资源类型
 */
public enum ResContentTypeEnum {
    ENTITY(0,"实体"),H5(4,"h5页面");

    private Integer code;
    private String name;

    ResContentTypeEnum(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
