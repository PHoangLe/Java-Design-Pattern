package org.pdp.creational.factorymethod.creator.impl;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.product.Document;
import org.pdp.creational.factorymethod.product.impl.PdfDocument;

public class PdfDocumentCreator extends DocumentCreator {

    private PdfDocument pdfDocument;

    @Override
    public Document createFile(String fileName) {
        if (pdfDocument == null) {
            pdfDocument = new PdfDocument(fileName);
            return pdfDocument;
        }

        pdfDocument.setFileName(fileName);

        return pdfDocument;
    }
}
