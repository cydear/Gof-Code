package com.basic.gof_code.buildergof;

public class ConcreteBuilderB extends IBuilder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.Add("添加部件X");
    }

    @Override
    public void buildPartB() {
        product.Add("添加部件Y");
    }

    @Override
    public void buildPartC() {
        product.Add("添加部件Z");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
