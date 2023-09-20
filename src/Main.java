public class Main {
    public static void main(String[] args) {

        Fila fila1 = Fila.getInstance();
        Fila fila2 = Fila.getInstance();

        fila1.ImprimeDocumento("Documento1");
        fila2.ImprimeDocumento("Documento2");

        fila1.RemoveDocumento();
        fila2.RemoveTodosDocumentos();
    }
}