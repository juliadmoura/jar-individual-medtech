package modelo;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private int idDepartamento;
    private String nome;
    private Hospital hospital;

    private int fkHospital;
    private List<Computador> computadores;

    public Departamento(int idDepartamento, String nome, Hospital hospital)
    {
        this.idDepartamento = idDepartamento;
        this.nome = nome;
        this.hospital = hospital;
        this.computadores = new ArrayList<>();
    };

    public Departamento(){
        this.hospital = new Hospital();
        this.computadores = new ArrayList<>();
    }

    //GETTERS
    public int getIdDepartamento()
    {
        return this.idDepartamento;
    }

    public String getNome()
    {
        return this.nome;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public List<Computador> getComputadores() {
        return computadores;
    }

    //Setters

    public void setIdDepartamento(int idDepartamento)
    {
        this.idDepartamento = idDepartamento;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
        hospital.addDepartamentos(this);
    }

    public void setFkHospital(int fkHospital) {
        this.fkHospital = fkHospital;
    }

    public void setComputadores(List<Computador> computadores) {
        this.computadores = computadores;
    }

    public int getFkHospital() {
        return this.fkHospital;
    }

    public void addComputadores(Computador computador){
        if(this.computadores.contains(computador)){
            return;
        }
        this.computadores.add(computador);
    }
}
