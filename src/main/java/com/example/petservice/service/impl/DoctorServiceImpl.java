package com.example.petservice.service.impl;

import com.example.petservice.entity.Doctor;
import com.example.petservice.mapper.DoctorMapper;
import com.example.petservice.service.IDoctorService;
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
public class DoctorServiceImpl extends ServiceImpl<DoctorMapper, Doctor> implements IDoctorService {

}
