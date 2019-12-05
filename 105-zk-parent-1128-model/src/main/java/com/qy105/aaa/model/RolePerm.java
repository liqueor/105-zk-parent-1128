package com.qy105.aaa.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@EqualsAndHashCode
public class RolePerm implements Serializable {
    private Integer rolePermId;
    private Integer roleId;
    private Integer permId;
}
