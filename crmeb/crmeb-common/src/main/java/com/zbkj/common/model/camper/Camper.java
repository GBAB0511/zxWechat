package com.zbkj.common.model.camper;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author wrg
 * @since 2024-12-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("eb_user_camper")
@ApiModel(value="Camper对象", description="")
public class Camper implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "头像地址")
    private String image;

    @ApiModelProperty(value = "营员姓名")
    private String camperName;

    @ApiModelProperty(value = "营员性别")
    private Integer camperSex;

    @ApiModelProperty(value = "营员年龄")
    private Integer camperAge;

    @ApiModelProperty(value = "证件类型")
    private Integer camperIdType;

    @ApiModelProperty(value = "证件号")
    private String camperIdNumber;

    @ApiModelProperty(value = "生日信息")
    private LocalDateTime camperBirthday;

    @ApiModelProperty(value = "民族")
    private String camperNationality;

    @ApiModelProperty(value = "营员身高")
    private Double camperHeight;

    @ApiModelProperty(value = "营员体重")
    private Double camperWeight;

    @ApiModelProperty(value = "兴趣爱好")
    private String camperHobby;

    @ApiModelProperty(value = "健康状态")
    private String camperHealthStatus;

    @ApiModelProperty(value = "家长寄语")
    private String camperParentMessage;

    @ApiModelProperty(value = "监护人姓名")
    private String camperGuardianName;

    @ApiModelProperty(value = "监护人电话")
    private String camperGuardianPhone;

    @ApiModelProperty(value = "紧急电话")
    private String emergencyPhoneNumber;

    @ApiModelProperty(value = "与营员关系")
    private String relationship;

    @ApiModelProperty(value = "详细地址")
    private String detailedAddress;

    @ApiModelProperty(value = "填写如何获取报名信息")
    private String howToObtain;

    @ApiModelProperty(value = "备注信息")
    private String notes;

    @ApiModelProperty(value = "用户id")
    private Integer userId;


}
