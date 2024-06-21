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
  @ApiModel(value = "Notice对象", description = "")
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("主键ID")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("内容")
      private String content;

      @ApiModelProperty("查看次数")
      private Integer viewCount;

      @ApiModelProperty("发布时间")
      private LocalDateTime createTime;

      @ApiModelProperty("标题")
      private String title;

      @ApiModelProperty("作者")
      private String author;


}
