package com.basic.gof_code.decoratorgof.starbucks;

public class StarBuzzCoffe {
    public static void main(String[] args) {
        //简单一杯咖啡
        Beverage beverage1 = new Espresso();
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());

        //两份摩卡加一杯豆浆
        Beverage beverage2 = new Espresso();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        System.out.println(beverage2.getDescription() + "$" + beverage2.cost());

        //一份摩卡加一份豆浆的黑咖啡
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        System.out.println(beverage3.getDescription() + "$" + beverage3.cost());
    }
}
