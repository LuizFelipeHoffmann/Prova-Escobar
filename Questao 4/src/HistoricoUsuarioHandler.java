public class HistoricoUsuarioHandler extends VerificacaoHandler {

    private int scoreMinimo;

    public HistoricoUsuarioHandler(int scoreMinimo) {
        this.scoreMinimo = scoreMinimo;
    }

    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        System.out.println("[Historico] Verificando histórico...");
        if (transacao.getScoreHistorico() < scoreMinimo) {
            System.out.println("  -> REPROVADA: score baixo (" + transacao.getScoreHistorico() + ")");
            return false;
        }
        System.out.println("  -> OK");
        return true;
    }
}