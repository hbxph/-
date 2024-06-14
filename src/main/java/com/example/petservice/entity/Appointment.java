package com.example.petservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
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
  @ApiModel(value = "Appointment对象", description = "")
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("主键")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("宠物ID")
      private Integer petId;

      @ApiModelProperty("用户ID")
      private Integer userId;

      @ApiModelProperty("医生ID")
      private Long doctorId;

      @ApiModelProperty("预约时间")
      private LocalDateTime applTime;

      @ApiModelProperty("信息")
      private String applInfo;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;

      @ApiModelProperty("状态")
      private String status;

      @ApiModelProperty("电话")
      private String phone;

      @ApiModelProperty("地址")
      private String address;


}
