package com.example.petservice.service.impl;

import com.example.petservice.entity.User;
import com.example.petservice.mapper.UserMapper;
import com.example.petservice.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aaa
 * @since 2024-06-13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
