package org.pdp.creational.factorymethod.creator;

import org.pdp.creational.factorymethod.product.Document;

public abstract class DocumentCreator {
    public abstract Document createFile(String fileName);

    public void initDocument(String fileName) {
        Document doc = createFile(fileName);
        doc.open();
        updateDocumentTitle();
        doc.close();
    }

    private void updateDocumentTitle() {
        System.out.println("Updating document title");
    }
}
