package org.pdp.creational.factorymethod.creator.impl;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.product.Document;
import org.pdp.creational.factorymethod.product.impl.PdfDocument;

public class PdfDocumentCreator implements DocumentCreator {
    @Override
    public Document createFile(String fileName) {
        return new PdfDocument(fileName);
    }
}
