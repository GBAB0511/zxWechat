package com.zbkj.common.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zbkj.common.model.product.StoreProductAttr;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 商品详情响应对象
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StoreProductInfoResponse对象", description="商品详情响应对象")
public class StoreProductInfoResponse implements Serializable {

    private static final long serialVersionUID = 9215241889318610262L;


    @ApiModelProperty(value = "商品id")
    private Integer id;

    @ApiModelProperty(value = "商品图片")
    private String image;

    @ApiModelProperty(value = "轮播图")
    private String sliderImage;

    @ApiModelProperty(value = "商品名称")
    private String storeName;

    @ApiModelProperty(value = "商品简介")
    private String storeInfo;

    @ApiModelProperty(value = "关键字")
    private String keyword;

    @ApiModelProperty(value = "分类id")
    private String cateId;

    @ApiModelProperty(value = "分类中文")
    private String cateStr;

    @ApiModelProperty(value = "单位名")
    private String unitName;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "是否热卖")
    private Boolean isHot;

    @ApiModelProperty(value = "是否优惠")
    private Boolean isBenefit;

    @ApiModelProperty(value = "是否精品")
    private Boolean isBest;

    @ApiModelProperty(value = "是否新品")
    private Boolean isNew;

    @ApiModelProperty(value = "获得积分")
    private Integer giveIntegral;

    @ApiModelProperty(value = "是否优品推荐")
    private Boolean isGood;

    @ApiModelProperty(value = "是否单独分佣")
    private Boolean isSub;

    @ApiModelProperty(value = "虚拟销量")
    private Integer ficti;

    @ApiModelProperty(value = "运费模板ID")
    private Integer tempId;

    @ApiModelProperty(value = "规格 0单 1多")
    private Boolean specType;

    @ApiModelProperty(value = "活动显示排序 0=默认，1=秒杀，2=砍价，3=拼团")
    private List<String> activity;

    @ApiModelProperty(value = "商品属性")
    private List<StoreProductAttr> attr;

    @ApiModelProperty(value = "商品属性详情")
    private List<AttrValueResponse> attrValue;

    @ApiModelProperty(value = "商品描述")
    private String content;

    @ApiModelProperty(value = "产品ID")
    private Integer productId;

//    @ApiModelProperty(value = "优惠券")
//    private List<StoreCoupon> coupons;

    @ApiModelProperty(value = "优惠券Ids")
    private List<Integer> couponIds;

    // 以下为活动商品部分

    @ApiModelProperty(value = "状态 0=关闭 1=开启|营销商品用")
    private Integer status;

    @ApiModelProperty(value = "运费模板ID|秒杀商品专用")
    private Integer timeId;

    @ApiModelProperty(value = "秒杀开启时间|秒杀专用")
    private String startTimeStr;

    @ApiModelProperty(value = "秒杀结束时间|秒杀专用")
    private String stopTimeStr;

    @ApiModelProperty(value = "当天参与秒杀次数|秒杀专用")
    private Integer num;
//
//    @ApiModelProperty(value = "砍价开启时间|砍价专用")
//    private Long startTime;
//
//    @ApiModelProperty(value = "砍价结束时间|砍价专用")
//    private Long stopTime;

    @ApiModelProperty(value = "砍价活动名称|砍价专用")
    private String title;

    @ApiModelProperty(value = "帮砍次数|砍价专用")
    private Integer bargainNum;

    @ApiModelProperty(value = "帮助砍价好友人数|砍价专用")
    private Integer peopleNum;

    @ApiModelProperty(value = "拼团订单有效时间(小时)|拼团专用")
    private Integer effectiveTime;

    @ApiModelProperty(value = "每个订单可购买数量|拼团专用")
    private Integer onceNum;

    @ApiModelProperty(value = "虚拟成团百分比|拼团专用")
    private Integer virtualRation;

    @ApiModelProperty(value = "参团人数|拼团专用")
    private Integer people;

    @ApiModelProperty(value = "商品状态|拼团专用")
    private Boolean isShow;

    @ApiModelProperty(value = "简介|拼团专用")
    private String info;

    @ApiModelProperty(value = "展示图")
    private String flatPattern;


    @ApiModelProperty(value = "开始时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @ApiModelProperty(value = "结束时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    @ApiModelProperty(value = "活动地址")
    private String address;

    @ApiModelProperty(value = "适龄区间")
    private String tips;

    @ApiModelProperty(value = "剩余时间")
    private Integer duration;

    @ApiModelProperty(value = "启程集合点")
    private String departureAssemblyPoint;

    @ApiModelProperty(value = "返程集合点")
    private String returnGatheringPoint;


    @ApiModelProperty(value = "早早鸟开始时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date earlyBirdStartTime;

    @ApiModelProperty(value = "早早鸟结束时间")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date earlyBirdEndTime;

    @ApiModelProperty(value = "优惠金额")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "课程内容")
    @NotBlank(message = "课程内容不能为空")
    private String courseContent;

    @ApiModelProperty(value = "食宿交通")
    @NotBlank(message = "食宿交通不能为空")
    private String transportation;

    @ApiModelProperty(value = "费用说明")
    @NotBlank(message = "费用说明不能为空")
    private String costDescription;

    @ApiModelProperty(value = "安全保障")
    @NotBlank(message = "安全保障不能为空")
    private String securityGuarantee;
}
