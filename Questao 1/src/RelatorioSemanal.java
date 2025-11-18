public class RelatorioSemanal implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("[SEMANAL] Coletando dados da semana...");
    }
    @Override
    public void gerarArquivo() {
        System.out.println("[SEMANAL] Gerando Excel...");
    }
}