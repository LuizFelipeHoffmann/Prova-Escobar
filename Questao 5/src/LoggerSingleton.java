public class LoggerSingleton {

    private static volatile LoggerSingleton instance;

    private String logFilePath = "sistema.log";

    private LoggerSingleton() {
        System.out.println("[Logger] Inicializando LoggerSingleton...");
    }

    public static LoggerSingleton getInstance() {
        if (instance == null) {
            synchronized (LoggerSingleton.class) {
                if (instance == null) {
                    instance = new LoggerSingleton();
                }
            }
        }
        return instance;
    }

    public void logErro(String mensagem) {
        String log = "[ERRO] " + mensagem;
        escreverLog(log);
        enviarServidorExterno(log);
    }

    public void logEvento(String mensagem) {
        String log = "[EVENTO] " + mensagem;
        escreverLog(log);
        enviarServidorExterno(log);
    }

    public void logAuditoria(String mensagem) {
        String log = "[AUDITORIA] " + mensagem;
        escreverLog(log);
        enviarServidorExterno(log);
    }

    private synchronized void escreverLog(String mensagem) {
        System.out.println("[ARQUIVO " + logFilePath + "] " + mensagem);
    }

    private void enviarServidorExterno(String mensagem) {
        System.out.println("[SERVIDOR EXTERNO] " + mensagem);
    }
}