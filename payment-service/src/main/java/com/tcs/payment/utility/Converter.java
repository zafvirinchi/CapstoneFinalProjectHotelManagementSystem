package com.tcs.payment.utility;

import com.tcs.payment.entity.Payment;
import com.tcs.payment.model.PaymentDto;

public interface Converter {
   public Payment convert(PaymentDto paymentDto);
}