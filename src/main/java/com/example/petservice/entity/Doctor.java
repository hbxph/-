package com.example.petservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author aaa
 * @since 2024-06-14
 */
@Getter
@Setter
  @ApiModel(value = "Doctor对象", description = "")
public class Doctor implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("医生主键ID")
        @TableId(value = "doctor_id", type = IdType.AUTO)
      private Integer doctorId;

      @ApiModelProperty("编号")
      private String doctorNumber;

      @ApiModelProperty("姓名")
      private String doctorName;

      @ApiModelProperty("照片")
      private String doctorPhoto;

      @ApiModelProperty("所属科室")
      private String doctorPost;

      @ApiModelProperty("邮件")
      private String doctorEmail;

      @ApiModelProperty("电话")
      private String doctorPhone;

      @ApiModelProperty("年龄")
      private Integer doctorAge;

      @ApiModelProperty("性别")
      private Integer doctorGender;

      @ApiModelProperty("职位")
      private String doctorLevel;

      @ApiModelProperty("简介1")
      private String doctorDemo1;

      @ApiModelProperty("简介2")
      private String doctorDemo2;

      @ApiModelProperty("简介3")
      private String doctorDemo3;


}
