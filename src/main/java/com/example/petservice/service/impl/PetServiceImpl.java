package com.example.petservice.service.impl;

import com.example.petservice.entity.Pet;
import com.example.petservice.mapper.PetMapper;
import com.example.petservice.service.IPetService;
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
public class PetServiceImpl extends ServiceImpl<PetMapper, Pet> implements IPetService {

}
