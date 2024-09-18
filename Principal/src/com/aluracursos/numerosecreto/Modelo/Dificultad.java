package com.aluracursos.numerosecreto.Modelo;
import java.util.LinkedList;
import java.util.List;

public abstract class Dificultad implements Comparable<Dificultad> {
 protected int numeroSecreto;
 protected int intentosMaximos;
 protected List<Integer> intentos = new LinkedList<>();

 public abstract void jugar();

 public void registrarIntento(int numero) {
   intentos.add(numero);
   System.out.print("Intentos anteriores" + intentos);
 }

 public void limpiarIntentos() {
   intentos.clear();
 }

 @Override
  public int compareTo(Dificultad otraDificultad) {
   return Integer.compare(this.intentosMaximos, otraDificultad.intentosMaximos);
 }

 public int getNumeroSecreto(){
   return numeroSecreto;
 }

 public int getIntentosMaximos() {
   return intentosMaximos;
 }
}
