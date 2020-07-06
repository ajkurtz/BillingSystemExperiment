package com.andykurtz.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class CustomerRequest {

    Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CustomerRequest{" +
                "customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerRequest that = (CustomerRequest) o;
        return Objects.equals(customer, that.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer);
    }

}
