package com.aluracursos.numerosecreto.Dificultad;

import com.aluracursos.numerosecreto.Modelo.Dificultad;
import com.aluracursos.numerosecreto.Modelo.NumeroSecreto;

import java.util.Scanner;

public class Normal extends Dificultad {
  public Normal() {
    this.intentosMaximos = 6;
    this.numeroSecreto = NumeroSecreto.generarNumeroSecreto(100);
  }

  @Override
  public void jugar() {
    Scanner sc = new Scanner(System.in);
    boolean acertado = false;

    for (int i = 1; i <= intentosMaximos; i++){
      System.out.println("Adivina el número (1-100):");
      int intento = sc.nextInt();
      registrarIntento(intento);

      if (intento == numeroSecreto){
        System.out.println("\n¡Correcto! Has encontrado el número.");
        acertado = true;
        break;
      }else if(intento > numeroSecreto){
        System.out.println("\nEl número secreto es menor");
      }else {
        System.out.println("\nEl número secreto es mayor");
      }
    }

    if (!acertado){
      System.out.println("Has perdido!."+"\nEl número era: " + numeroSecreto);
    }
    limpiarIntentos();
  }
}
