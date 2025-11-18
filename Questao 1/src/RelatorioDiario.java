public class RelatorioDiario implements Relatorio {
    @Override
    public void prepararDados() {
        System.out.println("[DIÁRIO] Coletando dados do dia atual...");
    }
    @Override
    public void gerarArquivo() {
        System.out.println("[DIÁRIO] Gerando PDF...");
    }
}