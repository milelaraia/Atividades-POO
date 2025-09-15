package br.inatel.poo.computador;

public class Computador {
    private String marca;
    private double preco;
    private HardwareBasico[] hardwares;
    private SistemaOperacional so;
    private MemoriaUSB memoria;

    public Computador(String marca, double preco, HardwareBasico[] hardwares,
                      SistemaOperacional so, MemoriaUSB memoria) {
        this.marca = marca;
        this.preco = preco;
        this.hardwares = hardwares;
        this.so = so;
        this.memoria = memoria;
    }

    public double getPreco() {
        return preco;
    }

    public void mostraPCConfigs() {
        System.out.println("\nComputador " + marca + " - R$" + preco);
        for (HardwareBasico h : hardwares) {
            h.mostrarInfo();
        }
        so.mostrarInfo();
        memoria.mostrarInfo();
    }

    public static Computador criarPromocao1() {
        return new Computador(
                "Apple", 361,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i3", 2200),
                        new HardwareBasico("Memória RAM", 8),
                        new HardwareBasico("HD", 500)
                },
                new SistemaOperacional("macOS Sequoia", 64),
                new MemoriaUSB("Pen-drive", 16)
        );
    }

    public static Computador criarPromocao2() {
        return new Computador(
                "Samsung", 361 + 1234,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i5", 3370),
                        new HardwareBasico("Memória RAM", 16),
                        new HardwareBasico("HD", 1024)
                },
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32)
        );
    }

    public static Computador criarPromocao3() {
        return new Computador(
                "Dell", 361 + 5678,
                new HardwareBasico[]{
                        new HardwareBasico("Pentium Core i7", 4500),
                        new HardwareBasico("Memória RAM", 32),
                        new HardwareBasico("HD", 2048)
                },
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1024)
        );
    }
}
