package docrec;

import java.util.ArrayList;

/*
nombre.edad.sexo.lugarResidencia.telefono.
sintomasPrincipal.historia.sintomasExtras.
antPersonal.antFamiliar.antAlergicos.antHospital.
signos.examenFisico.diagnostico.trataminento.
*/
public class Paciente {

    private String nombre;
    private int edad;
    private char sexo;
    private String lugarResidencia;
    private String telefono;
    private Sintoma sintomaPrincipal;
    private Historia historia;
    private ArrayList<Sintoma> sintomasExtras;
    private Antecedente antPersonal;
    private Antecedente antFamiliar;
    private Antecedente antAlergicos;
    private Antecedente antHospital;
    private ArrayList<SignoVital> signo;
    private ArrayList<Fisico> examenFisico;
    private Diagnostico diagnostico;
    private Tratamiento tratamiento;

    public Paciente(String nombtr, int edad, char sexo, String lugarResidencia, String telefono, Sintoma sintomaPrincipal, Historia historia, ArrayList<Sintoma> sintomasExtras, Antecedente antPersonal, Antecedente antFamiliar, Antecedente antAlergicos, Antecedente antHospital, ArrayList<SignoVital> signo, ArrayList<Fisico> examenFisico, Diagnostico diagnostico, Tratamiento tratamiento) {
        this.nombre = nombtr;
        this.edad = edad;
        this.sexo = sexo;
        this.lugarResidencia = lugarResidencia;
        this.telefono = telefono;
        this.sintomaPrincipal = sintomaPrincipal;
        this.historia = historia;
        this.sintomasExtras = sintomasExtras;
        this.antPersonal = antPersonal;
        this.antFamiliar = antFamiliar;
        this.antAlergicos = antAlergicos;
        this.antHospital = antHospital;
        this.signo = signo;
        this.examenFisico = examenFisico;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public String getNombtr() {
        return nombre;
    }

    public void setNombtr(String nombtr) {
        this.nombre = nombtr;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Sintoma getSintomaPrincipal() {
        return sintomaPrincipal;
    }

    public void setSintomaPrincipal(Sintoma sintomaPrincipal) {
        this.sintomaPrincipal = sintomaPrincipal;
    }

    public Historia getHistoria() {
        return historia;
    }

    public void setHistoria(Historia historia) {
        this.historia = historia;
    }

    public ArrayList<Sintoma> getSintomasExtras() {
        return sintomasExtras;
    }

    public void setSintomasExtras(ArrayList<Sintoma> sintomasExtras) {
        this.sintomasExtras = sintomasExtras;
    }

    public Antecedente getAntPersonal() {
        return antPersonal;
    }

    public void setAntPersonal(Antecedente antPersonal) {
        this.antPersonal = antPersonal;
    }

    public Antecedente getAntFamiliar() {
        return antFamiliar;
    }

    public void setAntFamiliar(Antecedente antFamiliar) {
        this.antFamiliar = antFamiliar;
    }

    public Antecedente getAntAlergicos() {
        return antAlergicos;
    }

    public void setAntAlergicos(Antecedente antAlergicos) {
        this.antAlergicos = antAlergicos;
    }

    public Antecedente getAntHospital() {
        return antHospital;
    }

    public void setAntHospital(Antecedente antHospital) {
        this.antHospital = antHospital;
    }

    public ArrayList<SignoVital> getSigno() {
        return signo;
    }

    public void setSigno(ArrayList<SignoVital> signo) {
        this.signo = signo;
    }

    public ArrayList<Fisico> getExamenFisico() {
        return examenFisico;
    }

    public void setExamenFisico(ArrayList<Fisico> examenFisico) {
        this.examenFisico = examenFisico;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Tratamiento getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(Tratamiento tratamiento) {
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombtr=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", lugarResidencia=" + lugarResidencia + ", telefono=" + telefono + ", sintomaPrincipal=" + sintomaPrincipal + ", historia=" + historia + ", sintomasExtras=" + sintomasExtras + ", antPersonal=" + antPersonal + ", antFamiliar=" + antFamiliar + ", antAlergicos=" + antAlergicos + ", antHospital=" + antHospital + ", signo=" + signo + ", examenFisico=" + examenFisico + ", diagnostico=" + diagnostico + ", tratamiento=" + tratamiento + '}';
    }

}
