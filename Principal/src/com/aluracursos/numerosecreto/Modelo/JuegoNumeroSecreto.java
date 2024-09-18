package com.aluracursos.numerosecreto.Modelo;

import com.aluracursos.numerosecreto.Dificultad.Avanzado;
import com.aluracursos.numerosecreto.Dificultad.Normal;
import com.aluracursos.numerosecreto.Dificultad.Principiante;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoNumeroSecreto {
  private Dificultad dificultad;

  public void elegirDificultad() {
    Scanner sc = new Scanner(System.in);
    int opcion = 0 ;

    System.out.println("Juego del Numero Secreto"+
            "\nElige un nivel de dificultad"+
            "\n1. Principiante"+
            "\n2. Normal"+
            "\n3. Avanzando"+
            "\n4. Salir"+
            "\nDigite una opción:");

    while (opcion < 1 || opcion > 4) {
      try {
        if (sc.hasNextInt()) {
          opcion = sc.nextInt();
          switch (opcion) {
            case 1:
              dificultad = new Principiante();
              break;
            case 2:
              dificultad = new Normal();
              break;
            case 3:
              dificultad = new Avanzado();
              break;
            case 4:
              System.exit(0);
            default:
              System.out.println("Nivel de dificultad no válido. Por favor, ingresa un número entre 1 y 4.");
              break;
          }
          dificultad.jugar();
        } else {
          System.out.println("Entrada inválida. Por favor, ingresa un número.");
          sc.next(); // Limpia el buffer del scanner
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Por favor, ingresa un número.");
        sc.next(); // Limpia el buffer del scanner
      }
    }
    sc.close();
  }
}
