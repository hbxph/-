package com.example.petservice.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
  @ApiModel(value = "Pet对象", description = "")
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("主键ID")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("用户ID")
      private Integer userId;

      @ApiModelProperty("宠物名")
      private String name;

      @ApiModelProperty("体重")
      private Double weight;

      @ApiModelProperty("身长")
      private Double height;

      @ApiModelProperty("宠物所属类型")
      private String type;

      @ApiModelProperty("出生时间")
      private LocalDateTime createTime;


}
