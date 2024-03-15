package com.haoapi.service;

import com.haoapi.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author XuHao
* @description 针对表【interface_info(接口信息表)】的数据库操作Service
* @createDate 2024-03-15 22:40:08
*/
@Service
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
