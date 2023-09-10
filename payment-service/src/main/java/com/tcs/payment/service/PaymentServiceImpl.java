package com.tcs.payment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.payment.entity.Payment;
import com.tcs.payment.model.PaymentDto;
import com.tcs.payment.repository.PaymentRepository;
import com.tcs.payment.utility.PaymentUtility;

@Service
public class PaymentServiceImpl implements PaymentService {
	@Autowired
	private PaymentRepository paymentRepository;

	public Payment addPayment(PaymentDto paymentDto) {
		return paymentRepository.save(new PaymentUtility().convert(paymentDto));
	}
}
