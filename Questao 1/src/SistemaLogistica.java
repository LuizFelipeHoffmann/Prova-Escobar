public class SistemaLogistica {
    public static void main(String[] args) {
        System.out.println("=== GERANDO RELATÓRIO DIÁRIO ===");
        CriadorRelatorio diario = new CriadorRelatorioDiario();
        diario.processarRelatorio();

        System.out.println("\n=== GERANDO RELATÓRIO SEMANAL ===");
        CriadorRelatorio semanal = new CriadorRelatorioSemanal();
        semanal.processarRelatorio();
    }
}