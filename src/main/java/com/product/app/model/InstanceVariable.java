package com.product.app.model;


public class InstanceVariable<SomeType extends Object> {
    private SomeType someData;

    public InstanceVariable(SomeType someData) {
        this.someData = someData;
    }

    public SomeType getSomeData() {
        return someData;
    }

    public void setSomeData(SomeType someData) {
        this.someData = someData;
    }
}

