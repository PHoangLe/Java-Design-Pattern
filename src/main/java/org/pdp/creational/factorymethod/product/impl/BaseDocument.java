package org.pdp.creational.factorymethod.product.impl;

import lombok.Setter;
import org.pdp.creational.factorymethod.product.Document;

@Setter
public abstract class BaseDocument implements Document {
    protected String fileName;

    protected BaseDocument(String fileName) {
        this.fileName = fileName;
    }
}
