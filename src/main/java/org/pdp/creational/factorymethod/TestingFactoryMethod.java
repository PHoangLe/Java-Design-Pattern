package org.pdp.creational.factorymethod;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.creator.impl.PdfDocumentCreator;
import org.pdp.creational.factorymethod.product.Document;

public class TestingFactoryMethod {
    public static void main(String[] args) {
        DocumentCreator creator = new PdfDocumentCreator();
        Document document = creator.createFile("test.pdf");

        document.open();
        document.close();
    }
}
