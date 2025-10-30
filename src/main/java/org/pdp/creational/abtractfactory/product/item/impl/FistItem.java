package org.pdp.creational.abtractfactory.product.item.impl;

import org.pdp.creational.abtractfactory.product.item.Item;

public class FistItem implements Item {
    @Override
    public void use() {
        System.out.println("And I punch");
    }
}
