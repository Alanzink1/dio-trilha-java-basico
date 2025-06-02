
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(int parametroUm, int parametroDois) {
        super("Algum ou todos os parâmetros informados são inválidos!");
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
