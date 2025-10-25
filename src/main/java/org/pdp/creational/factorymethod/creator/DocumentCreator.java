package org.pdp.creational.factorymethod.creator;

import org.pdp.creational.factorymethod.product.Document;

public interface DocumentCreator {
    Document createFile(String fileName);
}
