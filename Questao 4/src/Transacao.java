public class Transacao {
    private String id;
    private double valor;
    private String paisOrigem;
    private String paisUsuario;
    private int scoreHistorico;
    private String dispositivoId;
    private boolean dispositivoReconhecido;

    public Transacao(String id, double valor, String paisOrigem,
                     String paisUsuario, int scoreHistorico,
                     String dispositivoId, boolean dispositivoReconhecido) {
        this.id = id;
        this.valor = valor;
        this.paisOrigem = paisOrigem;
        this.paisUsuario = paisUsuario;
        this.scoreHistorico = scoreHistorico;
        this.dispositivoId = dispositivoId;
        this.dispositivoReconhecido = dispositivoReconhecido;
    }

    public String getId() { return id; }
    public double getValor() { return valor; }
    public String getPaisOrigem() { return paisOrigem; }
    public String getPaisUsuario() { return paisUsuario; }
    public int getScoreHistorico() { return scoreHistorico; }
    public String getDispositivoId() { return dispositivoId; }
    public boolean isDispositivoReconhecido() { return dispositivoReconhecido; }
}