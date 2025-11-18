public abstract class CriadorRelatorio {
    protected abstract Relatorio criarRelatorio();
    public void processarRelatorio() {
        Relatorio r = criarRelatorio();
        r.prepararDados();
        r.gerarArquivo();
    }
}