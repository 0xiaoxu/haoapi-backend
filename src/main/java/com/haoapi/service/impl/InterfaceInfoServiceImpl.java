package com.haoapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoapi.common.ErrorCode;
import com.haoapi.exception.BusinessException;
import com.haoapi.exception.ThrowUtils;
import com.haoapi.model.entity.InterfaceInfo;
import com.haoapi.service.InterfaceInfoService;
import com.haoapi.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
* @author XuHao
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2024-03-15 22:40:08
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{
    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }

        //TODO 信息没校验完，待补充完整
//        Long id = interfaceInfo.getId();
        String name = interfaceInfo.getName();
//        String description = interfaceInfo.getDescription();
//        String url = interfaceInfo.getUrl();
//        String requestHeader = interfaceInfo.getRequestHeader();
//        String responseHeader = interfaceInfo.getResponseHeader();
//        Integer status = interfaceInfo.getStatus();
//        Long userId = interfaceInfo.getUserId();
//        String method = interfaceInfo.getMethod();
//        Date createTime = interfaceInfo.getCreateTime();
//        Date updateTime = interfaceInfo.getUpdateTime();
//        Integer isDeleted = interfaceInfo.getIsDeleted();

        // 创建时，参数不能为空
        if (add) {
//            ThrowUtils.throwIf(StringUtils.isAnyBlank(name, content, tags), ErrorCode.PARAMS_ERROR);
            ThrowUtils.throwIf(StringUtils.isAnyBlank(name), ErrorCode.PARAMS_ERROR);
        }
        // 有参数则校验
//        if (StringUtils.isNotBlank(title) && title.length() > 80) {
//            throw new BusinessException(ErrorCode.PARAMS_ERROR, "标题过长");
//        }

    }
}




