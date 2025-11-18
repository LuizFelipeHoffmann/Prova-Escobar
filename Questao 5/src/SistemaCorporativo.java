public class SistemaCorporativo {

    public static void main(String[] args) {

        Runnable tarefa = () -> {
            LoggerSingleton logger = LoggerSingleton.getInstance();
            logger.logEvento("Thread " + Thread.currentThread().getName() + " iniciou processamento.");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                logger.logErro("Thread interrompida: " + e.getMessage());
            }
            logger.logAuditoria("Thread " + Thread.currentThread().getName() + " finalizou processamento.");
        };

        Thread t1 = new Thread(tarefa, "T1");
        Thread t2 = new Thread(tarefa, "T2");
        Thread t3 = new Thread(tarefa, "T3");

        t1.start();
        t2.start();
        t3.start();
    }
}