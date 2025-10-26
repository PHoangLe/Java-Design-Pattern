package org.pdp.creational.factorymethod.product.impl;

import org.pdp.creational.factorymethod.product.Document;

public class WordDocument extends BaseDocument implements Document {
    public WordDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void open() {
        System.out.println("Opening Word File " + fileName);
    }

    @Override
    public void close() {
        System.out.println("Closing Word File " + fileName);
    }
}
