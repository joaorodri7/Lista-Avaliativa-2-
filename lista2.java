package com.mycompany.lista2;

public class Lista2 {

    public static void main(String[] args) {
        
        Gerente gerente = new Gerente();
        gerente.setNome("Joao");
        gerente.setIdade(23);
        gerente.setMatricula("123213");
        gerente.setNomeGerencia("Pedrao");
        gerente.setSalario(100);
        System.out.println(gerente.toString());
        
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        cliente.setIdade(28);
        cliente.setSexo("Masculino");
        cliente.setValorDivida(500.50);
        cliente.setAnoNasc(1996);
        System.out.println(cliente.toString());
        
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Marcio");
        vendedor.setSalario(1980.2);
        vendedor.setValorVendas(5000);
        vendedor.setQntVendas(320);
        System.out.println(vendedor.toString());
        
    }
    
    //cria classe pessoa
    public static class Pessoa{
        public String nome;
        public int idade;
        public String sexo;
    
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    
    }
    
    //cria classe empregado
    public static class Empregado extends Pessoa{
        public double salario;
        public String matricula;
        public double valorinss;
        
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
        
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public double getValorinss(){
        return valorinss;
    }
    
    public void setValorinss(double valorinss){
        this.valorinss = salario*0.11;
    }
    
    
    }
    
    //cria classe cliente
    public static class Cliente extends Pessoa{
        private double valorDivida;
        private int anoNasc;
    
    
    public double getValorDivida(){
        return valorDivida;
    }
    
    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    
    public int getAnoNasc(){
        return anoNasc;
    }
    
    public void setAnoNasc(int anoNasc){
        this.anoNasc = anoNasc;
    }
    
        @Override
        public String toString() {
            return "Cliente: " +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade + '\'' +
                    ", sexo=" + sexo + '\'' +
                    ", valor da divida = " + valorDivida + '\'' +
                    "ano de nascimento = " + anoNasc;
                            
        }
    
    }
    
    //cria classe gerente
    public static class Gerente extends Empregado{
        public String nomeGerencia;
        
        public String getNomeGerencia(){
        return nomeGerencia;
    }
    
        public void setNomeGerencia(String nomeGerencia){
        this.nomeGerencia = nomeGerencia;
    }
        
    @Override
        public String toString() {
            return "Empregado: " +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade + '\'' +
                    ", matricula=" + matricula + '\'' +
                    ", nome da gerencia = " + nomeGerencia + '\'' +
                    ", valor do inss do gerente = " + valorinss;
                            
        }
    
    }
    
    //cria classe vendedor
    public static class Vendedor extends Empregado{
        private double valorVendas;
        private int qntVendas;
        
        public double getValorVendas(){
        return valorVendas;
    }
    
        public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }
        
        public int getQntVendas(){
        return qntVendas;
    }
    
        public void setQntVendas(int qntVendas){
        this.qntVendas = qntVendas;
    }
        
        @Override
        public String toString() {
            return "Vendedor: " +
                    "nome='" + nome + '\'' +
                    ", salario=" + salario + '\'' +
                    ", valor das vendas=" + valorVendas + '\'' +
                    ", quantidade de vendas = " + qntVendas;
        }
        
    }
    
    
}
