package org.pdp.creational.abtractfactory.factory;

import org.pdp.creational.abtractfactory.product.figure.Figure;
import org.pdp.creational.abtractfactory.product.item.Item;

public interface ToySetFactory {
    Figure createFigure();
    Item createItem();
}
