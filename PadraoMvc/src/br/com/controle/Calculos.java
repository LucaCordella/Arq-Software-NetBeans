package br.com.controle;

public class Calculos {
    // Criar atributos - Inserir dados e puxar memória
    private double valor1;
    private double valor2;
    
    // Criar objeto = cópia da classe

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }
    
    // Criar métodos com a regra de negócios (calcular soma)
    public double somar() {
        return this.valor1+this.valor2;
    }
    
}