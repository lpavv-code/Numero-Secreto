package com.aluracursos.numerosecreto.Modelo;

import java.util.Random;

public class NumeroSecreto {
  public static int generarNumeroSecreto(int rango) {
    Random rnd = new Random();//random import
    return rnd.nextInt(rango) + 1;
  }
}
