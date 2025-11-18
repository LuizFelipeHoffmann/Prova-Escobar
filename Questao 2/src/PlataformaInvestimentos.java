public class PlataformaInvestimentos {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(
                "João Silva",
                32,
                250_000.0,
                10,
                3
        );

        AnalisadorRisco analisador = new AnalisadorRisco(new ModeloModeradoStrategy());

        System.out.println("Analisando cliente: " + cliente.getNome());

        double riscoModerado = analisador.calcularRiscoPara(cliente);
        System.out.println("Risco (modelo moderado): " + riscoModerado);

        analisador.setStrategy(new ModeloAgressivoStrategy());
        double riscoAgressivo = analisador.calcularRiscoPara(cliente);
        System.out.println("Risco (modelo agressivo): " + riscoAgressivo);

        analisador.setStrategy(new ModeloConservadorStrategy());
        double riscoConservador = analisador.calcularRiscoPara(cliente);
        System.out.println("Risco (modelo conservador): " + riscoConservador);
    }
}