package com.stackroute;

public class Claim {

    private Customer customer;
    private Manager manager;
    private Surveyor surveyor;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Surveyor getSurveyor() {
        return surveyor;
    }

    public void setSurveyor(Surveyor surveyor) {
        this.surveyor = surveyor;
    }
}
