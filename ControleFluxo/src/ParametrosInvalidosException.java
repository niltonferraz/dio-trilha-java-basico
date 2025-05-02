
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

    public ParametrosInvalidosException() {
        super("Parâmetros inválidos fornecidos ao sistema.");
    }
}
