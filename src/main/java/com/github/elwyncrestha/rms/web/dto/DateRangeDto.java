package com.github.elwyncrestha.rms.web.dto;

import java.time.ZonedDateTime;

import lombok.Data;

/**
 * @author Elvin Shrestha on 8/29/2020
 */
@Data
public class DateRangeDto {

    private ZonedDateTime start;
    private ZonedDateTime end;
}
