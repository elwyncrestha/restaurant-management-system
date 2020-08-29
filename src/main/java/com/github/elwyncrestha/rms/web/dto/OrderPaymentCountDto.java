package com.github.elwyncrestha.rms.web.dto;

import lombok.Data;

/**
 * @author Elvin Shrestha on 8/29/2020
 */
@Data
public class OrderPaymentCountDto {

    private String reference;
    private long orders;
    private long payments;
}
