package org.pdp.creational.factorymethod.creator.impl;

import org.pdp.creational.factorymethod.creator.DocumentCreator;
import org.pdp.creational.factorymethod.product.Document;
import org.pdp.creational.factorymethod.product.impl.WordDocument;

public class WordDocumentCreator implements DocumentCreator {
    @Override
    public Document createFile(String fileName) {
        return new WordDocument(fileName);
    }
}
