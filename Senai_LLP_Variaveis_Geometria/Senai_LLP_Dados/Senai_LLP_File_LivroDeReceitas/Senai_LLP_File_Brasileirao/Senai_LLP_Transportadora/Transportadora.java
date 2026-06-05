import java.util.Scanner;

interface Transporte {
    double calcularFrete(double peso, double altura, double largura, double distancia);
}

abstract class Veiculo implements Transporte {
    private int anoFabricacao;
    private String marca;
    private String modelo;
    private String propulsao;

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropulsao() {
        return propulsao;
    }

    public void setPropulsao(String propulsao) {
        this.propulsao = propulsao;
    }
}

class VeiculoTerrestre extends Veiculo {
    private int qtdeRodas;
    private int qtdePortas;
    private String placa;
    private String chassi;

    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return 0;
    }
}

class VeiculoAereo extends Veiculo {
    private String rab;
    private int qtdeMotores;

    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return 0;
    }
}

class VeiculoFluvial extends Veiculo {
    private String registroMarinha;
    private double boca;
    private double caladoAereo;

    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return 0;
    }
}

class Caminhao extends VeiculoTerrestre {

    private int qtdeEixos;
    private double capacidade;
    private String carroceria;

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura)) * (distancia * 6.99);
    }
}

class Aviao extends VeiculoAereo {

    private double capacidadeCarga;
    private double mtow;

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return ((peso * peso) * (altura * largura)) * (distancia * 9.99);
    }
}

class PortaContainer extends VeiculoFluvial {

    private double capacidadeTEU;
    private String categoria;

    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura) * distancia);
    }
}

public class Transportadora {

    public static double calcular(Transporte transporte,
                                  double peso,
                                  double altura,
                                  double largura,
                                  double distancia) {

        return transporte.calcularFrete(
                peso,
                altura,
                largura,
                distancia
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        System.out.print("Largura: ");
        double largura = sc.nextDouble();

        System.out.print("Distância: ");
        double distancia = sc.nextDouble();

        Caminhao caminhao = new Caminhao();
        Aviao aviao = new Aviao();
        PortaContainer navio = new PortaContainer();

        System.out.println("\nFrete Caminhão: R$ " +
                calcular(caminhao, peso, altura, largura, distancia));

        System.out.println("Frete Avião: R$ " +
                calcular(aviao, peso, altura, largura, distancia));

        System.out.println("Frete Porta-Container: R$ " +
                calcular(navio, peso, altura, largura, distancia));

        sc.close();
    }
}