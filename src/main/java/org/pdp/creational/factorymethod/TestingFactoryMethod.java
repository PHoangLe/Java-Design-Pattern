package org.pdp.creational.factorymethod;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.creator.impl.PdfDocumentCreator;
import org.pdp.creational.factorymethod.product.Document;

public class TestingFactoryMethod {
    public static void main(String[] args) {
        DocumentCreator creator = new PdfDocumentCreator();
        Document document1 = creator.createFile("test.pdf");
        System.out.println(document1);

        document1.open();
        document1.close();

        Document document2 = creator.createFile("ac.pdf");
        System.out.println(document2);

        document1.open();
        document1.close();

        document2.open();
        document2.close();
    }
}
