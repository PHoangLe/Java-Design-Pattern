package org.pdp.creational.factorymethod.product.impl;

import org.pdp.creational.factorymethod.product.Document;

public abstract class BaseDocument implements Document {
    protected String fileName;

    protected BaseDocument(String fileName) {
        this.fileName = fileName;
    }
}
