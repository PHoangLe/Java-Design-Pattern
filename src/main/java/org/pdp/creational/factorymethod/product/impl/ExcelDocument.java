package org.pdp.creational.factorymethod.product.impl;

import org.pdp.creational.factorymethod.product.Document;

public class ExcelDocument extends BaseDocument implements Document {
    public ExcelDocument(String fileName) {
        super(fileName);
    }

    @Override
    public void open() {
        System.out.println("Opening Excel file " + fileName);
    }

    @Override
    public void close() {
        System.out.println("Closing Excel file " + fileName);
    }
}
