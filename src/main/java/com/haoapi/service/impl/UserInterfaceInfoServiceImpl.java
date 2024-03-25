package com.haoapi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoapi.model.entity.UserInterfaceInfo;
import com.haoapi.service.UserInterfaceInfoService;
import com.haoapi.mapper.UserInterfaceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author XuHao
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service实现
* @createDate 2024-03-25 18:50:52
*/
@Service
public class UserInterfaceInfoServiceImpl extends ServiceImpl<UserInterfaceInfoMapper, UserInterfaceInfo>
    implements UserInterfaceInfoService{

}




