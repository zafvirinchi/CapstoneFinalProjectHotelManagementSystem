package com.tcs.payment.utility;

import com.googlecode.jmapper.JMapper;
import com.googlecode.jmapper.api.JMapperAPI;
import com.tcs.payment.entity.Payment;
import com.tcs.payment.model.PaymentDto;

public class PaymentUtility implements Converter{
	JMapper<Payment,PaymentDto> jMapper;

	public PaymentUtility() {
		JMapperAPI api = new JMapperAPI()
				.add(JMapperAPI.mappedClass(Payment.class));
		
		jMapper = new JMapper<>(Payment.class, PaymentDto.class, api);
	}

	@Override
	public Payment convert(PaymentDto paymentDto) {
		return jMapper.getDestination(paymentDto);
	}
}
