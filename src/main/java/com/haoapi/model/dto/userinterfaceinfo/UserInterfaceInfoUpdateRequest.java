package com.haoapi.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户更新请求
 *
 * 
 * haoapi-backend
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口状态，0关闭，1开启
     */
    private Integer status;
    /**
     * 请求参数
     */
    private String requestParams;

    /**
     * 请求类型
     */
    private String method;

    private static final long serialVersionUID = 1L;
}