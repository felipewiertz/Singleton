public class Fila {

    private static Fila instancia;

    private Fila(){

    }

    public static Fila getInstance(){

        if (instancia == null )
        {
            instancia = new Fila();
        }
        return instancia;
    }

    public void ImprimeDocumento(String Documento){

        System.out.println("Imprimindo Documento = " + Documento);
    }

    public void RemoveDocumento(){
        System.out.println("Removendo Documento");
    }

    public void RemoveTodosDocumentos(){
        System.out.println("Removendo Todos os Documentos");
    }
}
