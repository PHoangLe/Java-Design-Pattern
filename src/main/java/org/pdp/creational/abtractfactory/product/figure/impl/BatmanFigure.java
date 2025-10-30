package org.pdp.creational.abtractfactory.product.figure.impl;

import org.pdp.creational.abtractfactory.product.figure.Figure;

public class BatmanFigure implements Figure {
    @Override
    public void play() {
        System.out.println("I'm batman");
    }
}
