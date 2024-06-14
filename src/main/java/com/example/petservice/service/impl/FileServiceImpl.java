package com.example.petservice.service.impl;

import com.example.petservice.entity.File;
import com.example.petservice.mapper.FileMapper;
import com.example.petservice.service.IFileService;
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
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements IFileService {

}
