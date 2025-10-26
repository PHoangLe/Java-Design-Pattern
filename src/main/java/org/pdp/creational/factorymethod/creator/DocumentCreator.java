package org.pdp.creational.factorymethod.creator;

import org.pdp.creational.factorymethod.product.Document;

public abstract class DocumentCreator {
    public abstract Document createFile(String fileName);

    public void doSomthing(String fileName) {
        Document doc = createFile(fileName);
        doc.open();
        doSomethingWithFile(fileName);
        doc.close();
    }

    private void doSomethingWithFile(String fileName) {
        System.out.println("Doing something with file " + fileName);
    }
}
