public class GeolocalizacaoHandler extends VerificacaoHandler {

    @Override
    protected boolean executarVerificacao(Transacao transacao) {
        System.out.println("[Geolocalizacao] Verificando origem...");
        if (!transacao.getPaisOrigem().equalsIgnoreCase(transacao.getPaisUsuario())) {
            System.out.println("  -> REPROVADA: origem suspeita (" + transacao.getPaisOrigem() + ")");
            return false;
        }
        System.out.println("  -> OK");
        return true;
    }
}