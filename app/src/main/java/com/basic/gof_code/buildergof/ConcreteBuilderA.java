package com.basic.gof_code.buildergof;

public class ConcreteBuilderA extends IBuilder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.Add("添加部件A");
    }

    @Override
    public void buildPartB() {
        product.Add("添加部件B");
    }

    @Override
    public void buildPartC() {
        product.Add("添加部件C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
