public class SistemaAntifraude {

    public static void main(String[] args) {

        VerificacaoHandler cadeia =
                new ValorSuspeitoHandler(10000);
        cadeia
                .setProximo(new GeolocalizacaoHandler())
                .setProximo(new HistoricoUsuarioHandler(50))
                .setProximo(new DispositivoIncomumHandler());

        Transacao t1 = new Transacao("TX-001", 1500, "BR", "BR", 80,
                "DEVICE-1", true);

        System.out.println("=== Avaliando " + t1.getId() + " ===");
        boolean r1 = cadeia.verificar(t1);
        System.out.println("Resultado: " + (r1 ? "APROVADA" : "REPROVADA"));
        System.out.println();

        Transacao t2 = new Transacao("TX-002", 50000, "BR", "BR", 90,
                "DEVICE-1", true);

        System.out.println("=== Avaliando " + t2.getId() + " ===");
        boolean r2 = cadeia.verificar(t2);
        System.out.println("Resultado: " + (r2 ? "APROVADA" : "REPROVADA"));
        System.out.println();

        Transacao t3 = new Transacao("TX-003", 900, "BR", "BR", 30,
                "DEVICE-X", false);

        System.out.println("=== Avaliando " + t3.getId() + " ===");
        boolean r3 = cadeia.verificar(t3);
        System.out.println("Resultado: " + (r3 ? "APROVADA" : "REPROVADA"));
    }
}