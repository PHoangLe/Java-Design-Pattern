package org.pdp.creational.abtractfactory;

import org.pdp.creational.abtractfactory.factory.ToySetFactory;
import org.pdp.creational.abtractfactory.factory.impl.SupermanToySet;
import org.pdp.creational.abtractfactory.product.figure.Figure;
import org.pdp.creational.abtractfactory.product.item.Item;

public class DemoAbstractFactory {
    public static void main(String[] args) {
        ToySetFactory supermanToyFactory = new SupermanToySet();
        Figure figure = supermanToyFactory.createFigure();
        Item item = supermanToyFactory.createItem();

        figure.play();
        item.use();;
    }
}
