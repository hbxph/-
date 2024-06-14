package com.example.petservice.service.impl;

import com.example.petservice.entity.Message;
import com.example.petservice.mapper.MessageMapper;
import com.example.petservice.service.IMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言表 服务实现类
 * </p>
 *
 * @author aaa
 * @since 2024-06-14
 */
@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements IMessageService {

}
