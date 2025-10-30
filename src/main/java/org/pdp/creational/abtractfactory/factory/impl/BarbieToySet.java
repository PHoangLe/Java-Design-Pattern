package org.pdp.creational.abtractfactory.factory.impl;

import org.pdp.creational.abtractfactory.factory.ToySetFactory;
import org.pdp.creational.abtractfactory.product.figure.Figure;
import org.pdp.creational.abtractfactory.product.figure.impl.BarbieFigure;
import org.pdp.creational.abtractfactory.product.item.Item;
import org.pdp.creational.abtractfactory.product.item.impl.FistItem;

public class BarbieToySet implements ToySetFactory {
    @Override
    public Figure createFigure() {
        return new BarbieFigure();
    }

    @Override
    public Item createItem() {
        return new FistItem();
    }
}
