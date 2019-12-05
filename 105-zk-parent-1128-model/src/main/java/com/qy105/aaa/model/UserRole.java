package com.qy105.aaa.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@EqualsAndHashCode
public class UserRole implements Serializable {
    private Long userRoleId;
    private Long userId;
    private Integer roleId;
}
