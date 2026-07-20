package practice2.task9;

public class DocumentAdapter implements DocumentProcessor {

    private final PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        System.out.println("Адаптация PDF к DOC");
        pdfProcessor.readPdf();
        pdfProcessor.convertToDoc();
        System.out.println("Документ преобразован в формат .doc");
        System.out.println("Передача на дальнейшую обработку...");
        DOCProcessor docProcessor = new DOCProcessor();
        docProcessor.process();
    }
}
