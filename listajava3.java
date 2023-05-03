package com.mycompany.lista3;

public class Lista3 {

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nome: João");
        pessoa.setEndereco("Endereco: Rua A, nº 123");
        pessoa.setTelefone("Tel: (61) 99999-9999");
        System.out.println(pessoa.getNome()); 
        System.out.println(pessoa.getEndereco()); 
        System.out.println(pessoa.getTelefone());
        
        Fornecedor fornecedor1 = new Fornecedor();
        fornecedor1.setNome("\nNome da Empresa: Empresa A");
        fornecedor1.setEndereco("Endereco: Av. B, nº 456");
        fornecedor1.setTelefone("Tel: (61) 88888-8888");
        fornecedor1.setValorCredito(10000.0);
        fornecedor1.setValorDivida(5000.0);
        System.out.println(fornecedor1.getNome()); 
        System.out.println(fornecedor1.getEndereco()); 
        System.out.println(fornecedor1.getTelefone()); 
        System.out.println("Valor credito: " +fornecedor1.getValorCredito()); 
        System.out.println("Valor divida: " +fornecedor1.getValorDivida()); 
        fornecedor1.setValorCredito(10000.0);
        fornecedor1.setValorDivida(5000.0);
        System.out.println("Valor saldo: " +fornecedor1.obterSaldo()); 
        
        Empregado empregado1 = new Empregado();
        empregado1.setNome("João");
        empregado1.setEndereco("Rua Y, nº 789");
        empregado1.setTelefone("(61) 77777-7777");
        empregado1.setCodigoSetor(123);
        empregado1.setSalarioBase(2000.0);
        empregado1.setImposto(10.0);
        System.out.println("\nDados do empregado:");
        System.out.println("Nome: " + empregado1.getNome());
        System.out.println("Endereço: " + empregado1.getEndereco());
        System.out.println("Telefone: " + empregado1.getTelefone());
        System.out.println("Código do setor: " + empregado1.getCodigoSetor());
        System.out.println("Salário base: " + empregado1.getSalarioBase());
        System.out.println("Imposto: " + empregado1.getImposto());
        System.out.println("Salario Liquido: " +empregado1.calcularSalario());
        
        Administrador admin1 = new Administrador();
        admin1.setNome("Maria");
        admin1.setEndereco("Rua X, nº 123");
        admin1.setTelefone("(61) 88888-8888");
        admin1.setCodigoSetor(456);
        admin1.setSalarioBase(3000.0);
        admin1.setImposto(15.0);
        admin1.setAjudaDeCusto(500.0);
        System.out.println("\nDados do administrador:");
        System.out.println("Nome: " + admin1.getNome());
        System.out.println("Endereço: " + admin1.getEndereco());
        System.out.println("Telefone: " + admin1.getTelefone());
        System.out.println("Código do setor: " + admin1.getCodigoSetor());
        System.out.println("Salário base: " + admin1.getSalarioBase());
        System.out.println("Imposto: " + admin1.getImposto());
        System.out.println("Ajuda de custo: " + admin1.getAjudaDeCusto());
        System.out.println("Salário: " + admin1.calcularSalario());
        
        Operario operario1 = new Operario();
        operario1.setNome("Carlos");
        operario1.setEndereco("Rua Z, nº 987");
        operario1.setTelefone("(61) 66666-6666");
        operario1.setCodigoSetor(789);
        operario1.setSalarioBase(1500.0);
        operario1.setImposto(8.0);
        operario1.setValorProducao(12000.0);
        operario1.setComissao(5.0);
        System.out.println("\nDados do operario:");
        System.out.println("Nome: " + operario1.getNome());
        System.out.println("Endereço: " + operario1.getEndereco());
        System.out.println("Telefone: " + operario1.getTelefone());
        System.out.println("Código do setor: " + operario1.getCodigoSetor());
        System.out.println("Salário base: " + operario1.getSalarioBase());
        System.out.println("Imposto: " + operario1.getImposto());
        System.out.println("Valor de produção: " + operario1.getValorProducao());
        System.out.println("Comissão: " + operario1.getComissao());
        System.out.println("Salário: " + operario1.calcularSalario());

        
        Vendedor vendedor1 = new Vendedor();
        vendedor1.setNome("Lucas");
        vendedor1.setEndereco("Rua W, nº 654");
        vendedor1.setTelefone("(61) 55555-5555");
        vendedor1.setCodigoSetor(951);
        vendedor1.setSalarioBase(1800.0);
        vendedor1.setImposto(7.0);
        vendedor1.setValorVendas(25000.0);
        vendedor1.setComissao(4.0);
        System.out.println("\nDados do vendedor:");
        System.out.println("Nome: " + vendedor1.getNome());
        System.out.println("Endereço: " + vendedor1.getEndereco());
        System.out.println("Telefone: " + vendedor1.getTelefone());
        System.out.println("Código do setor: " + vendedor1.getCodigoSetor());
        System.out.println("Salário base: " + vendedor1.getSalarioBase());
        System.out.println("Imposto: " + vendedor1.getImposto());
        System.out.println("Valor de vendas: " + vendedor1.getValorVendas());
        System.out.println("Comissão: " + vendedor1.getComissao());
        System.out.println("Salário: " + vendedor1.calcularSalario());
    }
    
    public static class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}

    public static class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
    
    public double obterSaldo() {
        return valorCredito - valorDivida;
    }
      
}
    
    public static class Empregado extends Pessoa {
    public int codigoSetor;
    public double salarioBase;
    public double imposto;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario() {
    double valorImposto = salarioBase * (imposto / 100);
    return salarioBase - valorImposto;
}
    
    }
    
    public static class Administrador extends Empregado {
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}
    
    public static class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double valorComissao = valorProducao * (comissao / 100);
        return super.calcularSalario() + valorComissao;
    }
}
    
    public static class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double valorComissao = valorVendas * (comissao / 100);
        return super.calcularSalario() + valorComissao;
    }
}
    
}
     
