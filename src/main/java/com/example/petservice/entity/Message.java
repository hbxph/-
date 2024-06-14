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
 * 留言表
 * </p>
 *
 * @author aaa
 * @since 2024-06-14
 */
@Getter
@Setter
  @ApiModel(value = "Message对象", description = "留言表")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

      @ApiModelProperty("ID")
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      @ApiModelProperty("内容")
      private String content;

      @ApiModelProperty("评论人")
      private String username;

      @ApiModelProperty("评论时间")
      private String time;

      @ApiModelProperty("父ID")
      private Long parentId;

      @ApiModelProperty("关联id")
      private Integer foreignId;


}
