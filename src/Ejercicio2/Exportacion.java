package Ejercicio2;

public class Exportacion {

    public static void main(String[] args) {
        
        Documento docPdf = new Documento();
        docPdf.exportarDoc();
        
        Word docWord = new Word();
        docWord.exportarDoc();
        
        Excel docExcel = new Excel();
        docExcel.exportarDoc();
    }
    
}
