package com.zwl.domain.customer.gateway;

import com.zwl.domain.customer.Customer;

public interface CustomerGateway {
    Customer getByById(String customerId);
}
