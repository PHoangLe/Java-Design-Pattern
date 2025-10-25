package org.pdp.creational.factorymethod.product.impl;

import lombok.Getter;
import lombok.Setter;
import org.pdp.creational.factorymethod.product.Document;

@Getter
@Setter
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
