package com.github.elwyncrestha.rms.web.chart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.elwyncrestha.rms.api.order.service.OrderService;
import com.github.elwyncrestha.rms.api.payment.service.PaymentService;
import com.github.elwyncrestha.rms.web.dto.DateRangeDto;
import com.github.elwyncrestha.rms.web.dto.OrderPaymentCountDto;

/**
 * @author Elvin Shrestha on 8/29/2020
 */
@RestController
@RequestMapping(ChartController.URL)
public class ChartController {

    static final String URL = "/api/charts";
    private final OrderService orderService;
    private final PaymentService paymentService;

    public ChartController(OrderService orderService,
        PaymentService paymentService) {
        this.orderService = orderService;
        this.paymentService = paymentService;
    }

    @PostMapping("/summary")
    public ResponseEntity<?> getSummaryData(@RequestBody List<DateRangeDto> dtoList) {
        List<OrderPaymentCountDto> summary = new ArrayList<>();
        dtoList.forEach(d -> {
            OrderPaymentCountDto dto = new OrderPaymentCountDto();
            dto.setReference(d.getReference());
            dto.setOrders(orderService.countOrdersByOrderDateTimeBetween(d.getStart(), d.getEnd()));
            dto.setPayments(
                paymentService.countPaymentsByPaymentDateTimeBetween(d.getStart(), d.getEnd()));
            summary.add(dto);
        });
        return ResponseEntity.ok(summary);
    }
}
