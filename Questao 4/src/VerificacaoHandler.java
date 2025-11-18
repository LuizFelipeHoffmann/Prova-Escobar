public abstract class VerificacaoHandler {

    private VerificacaoHandler proximo;

    public VerificacaoHandler setProximo(VerificacaoHandler proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public boolean verificar(Transacao transacao) {
        if (!executarVerificacao(transacao)) {
            return false;
        }
        if (proximo == null) {
            return true;
        }
        return proximo.verificar(transacao);
    }

    protected abstract boolean executarVerificacao(Transacao transacao);
}