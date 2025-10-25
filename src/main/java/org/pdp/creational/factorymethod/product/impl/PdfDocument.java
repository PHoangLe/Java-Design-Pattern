package org.pdp.creational.factorymethod.product.impl;

import lombok.Getter;
import lombok.Setter;
import org.pdp.creational.factorymethod.product.Document;

@Getter
@Setter
public class PdfDocument extends BaseDocument implements Document {
    public PdfDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF File " + fileName);
    }

    @Override
    public void close() {
        System.out.println("Closing PDF File " + fileName);
    }
}
