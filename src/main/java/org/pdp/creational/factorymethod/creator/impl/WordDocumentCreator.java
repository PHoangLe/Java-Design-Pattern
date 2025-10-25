package org.pdp.creational.factorymethod.creator.impl;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.product.Document;
import org.pdp.creational.factorymethod.product.impl.WordDocument;

public class WordDocumentCreator implements DocumentCreator {

    private WordDocument wordDocument;

    @Override
    public Document createFile(String fileName) {
        if (wordDocument == null) {
            wordDocument = new WordDocument(fileName);
            return wordDocument;
        }

        wordDocument.setFileName(fileName);

        return wordDocument;
    }
}
