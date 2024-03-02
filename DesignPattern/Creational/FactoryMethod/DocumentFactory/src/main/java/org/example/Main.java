package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static void main(String[] args) throws InstantiationException, IllegalAccessException {
            // Register document types using map
            DocumentFactory.registerDocumentType("PDF", PDFDocument.class);
            DocumentFactory.registerDocumentType("Word", WordDocument.class);

            // Create documents
            Document pdfDoc = DocumentFactory.createDocument("PDF");
            System.out.println(pdfDoc.create());

            Document wordDoc = DocumentFactory.createDocument("Word");
            System.out.println(wordDoc.create());
        }
}