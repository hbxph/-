package com.example.petservice.service.impl;

import com.example.petservice.entity.Appointment;
import com.example.petservice.mapper.AppointmentMapper;
import com.example.petservice.service.IAppointmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aaa
 * @since 2024-06-14
 */
@Service
public class AppointmentServiceImpl extends ServiceImpl<AppointmentMapper, Appointment> implements IAppointmentService {

}
