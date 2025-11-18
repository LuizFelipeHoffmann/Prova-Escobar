public class ValorSuspeitoHandler extends VerificacaoHandler {

    private double limiteAltoRisco;

    public ValorSuspeitoHandler(double limiteAltoRisco) {
        this.limiteAltoRisco = limiteAltoRisco;
    }

    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        System.out.println("[ValorSuspeito] Verificando valor...");
        if (transacao.getValor() > limiteAltoRisco) {
            System.out.println("  -> REPROVADA: valor muito alto (" + transacao.getValor() + ")");
            return false;
        }
        System.out.println("  -> OK");
        return true;
    }
}