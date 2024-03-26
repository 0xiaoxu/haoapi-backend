package com.haoapi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import haoapicommon.model.entity.UserInterfaceInfo;

public interface UserInterfaceInfoService  extends IService<UserInterfaceInfo> {
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);

}
