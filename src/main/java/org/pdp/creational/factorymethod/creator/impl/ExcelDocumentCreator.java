package org.pdp.creational.factorymethod.creator.impl;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.product.Document;
import org.pdp.creational.factorymethod.product.impl.ExcelDocument;

public class ExcelDocumentCreator extends DocumentCreator {

    private ExcelDocument excelDocument;

    @Override
    public Document createFile(String fileName) {
        if (excelDocument == null) {
            excelDocument = new ExcelDocument(fileName);
            return excelDocument;
        }

        this.excelDocument.setFileName(fileName);

        return excelDocument;
    }
}
