package com.zwl.domain.customer.gateway;

import com.zwl.domain.customer.Credit;

//Assume that the credit info is in another distributed Service
public interface CreditGateway {
    Credit getCredit(String customerId);
}
