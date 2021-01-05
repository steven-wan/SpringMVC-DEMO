package com.stevenwan.study.dto;

import lombok.Data;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author steven-wan
 * @desc
 * @date 2021-01-05 16:24
 */
@Data
public class BarCodePayDTO {
    /**
     * 商品名字
     */
    @NotEmpty(message = "{goodsName_is_null}")
    private String goodsName;

    /**
     * 订单标题
     */
    @NotEmpty(message = "{goodsSubject_is_null}")
    private String goodsSubject;

    /**
     * 二维码条码
     */
    @NotEmpty(message = "{authCode_is_null}")
    private String authCode;

    /**
     * 金额
     */
    @NotNull(message = "{amount_is_null}")
    @DecimalMin(value = "0.0", message = "{amount_min}", inclusive = false)
    private BigDecimal amount;


    /**
     * 支付超时时间 单位 分钟
     */
    @NotNull(message = "{timeOut_is_null}")
    private Integer timeOut;

    /**
     * 业务支付单号
     */
    @NotEmpty(message = "{orderNo_is_null}")
    private String orderNo;

    /**
     * 商户号
     */
    @NotEmpty(message = "{merchantNo_is_null}")
    private String merchantNo;
}
