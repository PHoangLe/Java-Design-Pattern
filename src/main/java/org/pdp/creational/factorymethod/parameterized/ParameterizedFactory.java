package org.pdp.creational.factorymethod.parameterized;

import org.pdp.creational.factorymethod.product.Document;
import org.pdp.creational.factorymethod.product.impl.ExcelDocument;
import org.pdp.creational.factorymethod.product.impl.PdfDocument;
import org.pdp.creational.factorymethod.product.impl.WordDocument;

public class ParameterizedFactory {
    public Document createDocument(String fileName) {
        String extension = fileName.substring(fileName.lastIndexOf(".") + 1);

        return switch (extension) {
            case "pdf" -> new PdfDocument(fileName);
            case "docx" -> new WordDocument(fileName);
            case "xls" -> new ExcelDocument(fileName);
            default -> throw new IllegalArgumentException("Unsupported extension: " + extension);
        };
    }
}
