package Exercise;

interface DocumentsFactory{
    void CreateDocument();

}
class wordDocument implements DocumentsFactory{
    public void CreateDocument(){
        System.out.println("Creaded word Documents");
    }
}
class pdfDocument implements DocumentsFactory{
    public void CreateDocument(){
        System.out.println("Creaded pdf Documents");
    }
}
class exelDocument implements DocumentsFactory{
    public void CreateDocument(){
        System.out.println("Creaded exel Documents");
    }
}
class DocumentsFactory2{
    public abstract DocumentsFactory createDocument(){
    }
}
class wordDocumentcreate extends DocumentsFactory2{

}
public class FactoryMethodPatternExample {
    public static void main(String[] args){
         DocumentsFactory2 factory = new DocumentsFactory2();

        DocumentsFactory doc1 = factory.getDocument("word");
        doc1.CreateDocument();

        DocumentsFactory doc2 = factory.getDocument("pdf");
        doc2.CreateDocument();

        DocumentsFactory doc3 = factory.getDocument("excel");
        doc3.CreateDocument();
    }
}
