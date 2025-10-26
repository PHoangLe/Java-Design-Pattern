package org.pdp.creational.factorymethod;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.creator.impl.PdfDocumentCreator;
import org.pdp.creational.factorymethod.creator.impl.WordDocumentCreator;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        DocumentCreator creator = new PdfDocumentCreator();
        creator.doSomething("pdfFile");

        creator = new WordDocumentCreator();
        creator.doSomething("wordFile");
    }
}
