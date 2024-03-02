package org.example;


import java.util.HashMap;
import java.util.Map;

//using reflection

class DocumentFactory {
    private static Map<String, Class<? extends Document>> documentTypes = new HashMap<>();

    static void registerDocumentType(String docType, Class<? extends Document> documentClass) {
        documentTypes.put(docType, documentClass);
    }

    static Document createDocument(String docType) throws IllegalAccessException, InstantiationException {
        Class<? extends Document> documentClass = documentTypes.get(docType);
        if (documentClass != null) {
            return documentClass.newInstance();
        } else {
            throw new IllegalArgumentException("Invalid document type");
        }
    }
}