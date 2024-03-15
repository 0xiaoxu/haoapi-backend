package com.haoapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoapi.model.entity.InterfaceInfo;
import com.haoapi.service.InterfaceInfoService;
import com.haoapi.mapper.InterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author XuHao
* @description 针对表【interface_info(接口信息表)】的数据库操作Service实现
* @createDate 2024-03-15 22:40:08
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

}




