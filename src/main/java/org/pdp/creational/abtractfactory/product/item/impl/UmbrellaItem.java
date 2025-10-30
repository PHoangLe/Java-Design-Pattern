package org.pdp.creational.abtractfactory.product.item.impl;

import org.pdp.creational.abtractfactory.product.item.Item;

public class UmbrellaItem implements Item {
    @Override
    public void use() {
        System.out.println("And you are not going to get wet");
    }
}
