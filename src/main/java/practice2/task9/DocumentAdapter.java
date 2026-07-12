package practice2.task9;

public class DocumentAdapter implements DocumentProcessor {

    private PDFProcessor pdfProcessor;

    public DocumentAdapter(PDFProcessor pdfProcessor) {
        this.pdfProcessor = pdfProcessor;
    }

    @Override
    public void process() {
        System.out.println("Конвертация формата PDF -> DOC");
        pdfProcessor.process();
    }
}
