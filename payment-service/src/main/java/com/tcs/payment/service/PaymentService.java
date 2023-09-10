package com.tcs.payment.service;

import com.tcs.payment.entity.Payment;
import com.tcs.payment.model.PaymentDto;

public interface PaymentService {

	public Payment addPayment(PaymentDto paymentDto);

}
