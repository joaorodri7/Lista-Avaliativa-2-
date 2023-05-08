package com.mycompany.lista4;

public class Lista4 {

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        aluno.setNome("Aluno: Joao");
        aluno.setMatricula("Matricula: 1111");
        aluno.setIdade(18);
        aluno.setCpf("CPF: 1234251233");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getMatricula());
        System.out.println("Idade: " +aluno.getIdade());
        System.out.println(aluno.getCpf());
        
        Professor professor = new Professor();
        professor.setNome("\nProfessor: Pedro");
        professor.setIdade(26);
        professor.setDisciplina("Disciplina: Matematica");
        professor.setCpf("CPF: 0000000000");
        System.out.println(professor.getNome());
        System.out.println("Idade: " +professor.getIdade());
        System.out.println(professor.getDisciplina());
        System.out.println(professor.getCpf());
        
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(1200);
        funcionario.setNome("\nFuncionario: Marcos");
        funcionario.setIdade(36);
        funcionario.setCpf("CPF: 9999999999");
        funcionario.setCargo("Cargo: Zelador");
        System.out.println(funcionario.getNome());
        System.out.println("Idade: " +funcionario.getIdade());
        System.out.println(funcionario.getCpf());
        System.out.println(funcionario.getCargo());
        System.out.println("Salario: " +funcionario.getSalario());
        
    }
    
    public static class Pessoa{
        public String nome;
        public String cpf;
        public int idade;
        
        public String getNome(){
            return nome;
        }
        
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public String getCpf(){
            return cpf;
        }
        
        public void setCpf(String cpf){
            this.cpf = cpf;
        }
        
        public int getIdade(){
        return idade;
        }
    
        public void setIdade(int idade){
        this.idade = idade;
        }
           
    }
    
    
    public static class Aluno extends Pessoa{
        public String matricula;
        
        public String getMatricula(){
            return matricula;
        }
        
        public void setMatricula(String matricula){
            this.matricula = matricula;
        }
        
    }
    
    public static class Professor extends Pessoa{
        public String disciplina;
        
        public String getDisciplina(){
            return disciplina;
        }
        
        public void setDisciplina(String disciplina){
            this.disciplina = disciplina;
        }
    }
    
    
    public static class Funcionario extends Pessoa{
        public String cargo;
        public double salario;
        
        public String getCargo(){
            return cargo;
        }
        
        public void setCargo(String cargo){
            this.cargo = cargo;
        }
        
        public double getSalario(){
            return salario;
        }
        
        public void setSalario(double salario){
            this.salario = salario;
        }
        
    }
    
}

