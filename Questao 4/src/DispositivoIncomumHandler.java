public class DispositivoIncomumHandler extends VerificacaoHandler {

    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        System.out.println("[Dispositivo] Verificando dispositivo...");
        if (!transacao.isDispositivoReconhecido()) {
            System.out.println("  -> REPROVADA: dispositivo não reconhecido (" + transacao.getDispositivoId() + ")");
            return false;
        }
        System.out.println("  -> OK");
        return true;
    }
}