package com.example.petservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
  @TableName("pet_daily")
@ApiModel(value = "PetDaily对象", description = "")
public class PetDaily implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("主键ID")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("宠物ID")
      private Long petId;

      @ApiModelProperty("用户ID")
      private Long userId;

      @ApiModelProperty("体温")
      private Double temperature;

      @ApiModelProperty("体重")
      private Double weight;

      @ApiModelProperty("身长")
      private Double height;

      @ApiModelProperty("饭量")
      private Double appetite;

      @ApiModelProperty("状态")
      private String status;

      @ApiModelProperty("创建时间")
      private LocalDateTime createTime;


}
