package org.pdp.creational.abtractfactory.factory.impl;

import org.pdp.creational.abtractfactory.factory.ToySetFactory;
import org.pdp.creational.abtractfactory.product.figure.Figure;
import org.pdp.creational.abtractfactory.product.figure.impl.BatmanFigure;
import org.pdp.creational.abtractfactory.product.item.Item;
import org.pdp.creational.abtractfactory.product.item.impl.UmbrellaItem;

public class SupermanToySet implements ToySetFactory {
    @Override
    public Figure createFigure() {
        return new BatmanFigure();
    }

    @Override
    public Item createItem() {
        return new UmbrellaItem();
    }
}
