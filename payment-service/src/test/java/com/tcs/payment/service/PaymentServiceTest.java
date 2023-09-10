package com.tcs.payment.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.tcs.payment.entity.Payment;
import com.tcs.payment.model.PaymentDto;
import com.tcs.payment.repository.PaymentRepository;
import com.tcs.payment.service.PaymentServiceImpl;
import com.tcs.payment.utility.PaymentUtility;

class PaymentServiceTest {

	@Mock
	private PaymentRepository paymentRepository;

	@InjectMocks
	private PaymentServiceImpl paymentService;

	private PaymentUtility paymentUtility;
	private Payment payment;
	private PaymentDto paymentDto;

	@BeforeEach
	void beforeEach() {
		MockitoAnnotations.openMocks(this);
		paymentUtility = new PaymentUtility();
		paymentDto = new PaymentDto();
		paymentDto.setId(111111);
		paymentDto.setModeOfPayment("Credit Card");
		paymentDto.setStatus("Success");
		payment = paymentUtility.convert(paymentDto);
	}

	@Test
	void addPaymentTest() {
		Mockito.when(paymentRepository.save(payment)).thenReturn(payment);
		Payment paymentEntity = paymentService.addPayment(paymentDto);
		Assertions.assertAll(() -> assertNotNull(paymentEntity),
				() -> assertEquals(paymentEntity.getStatus(), paymentDto.getStatus()));
	}

}
