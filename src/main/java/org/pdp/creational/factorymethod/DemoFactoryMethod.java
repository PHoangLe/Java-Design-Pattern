package org.pdp.creational.factorymethod;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.creator.impl.PdfDocumentCreator;
import org.pdp.creational.factorymethod.creator.impl.WordDocumentCreator;
import org.pdp.creational.factorymethod.parameterized.ParameterizedFactory;
import org.pdp.creational.factorymethod.product.Document;

public class DemoFactoryMethod {
    public static void main(String[] args) {
        DocumentCreator creator = new PdfDocumentCreator();
        creator.initDocument("pdfFile");

        creator = new WordDocumentCreator();
        creator.initDocument("wordFile");

        ParameterizedFactory factory = new ParameterizedFactory();
        Document document = factory.createDocument("abc.pdf");
        document.open();
        document.close();
    }
}
