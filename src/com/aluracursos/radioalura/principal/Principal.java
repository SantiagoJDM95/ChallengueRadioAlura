package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");     //Objeto Cancion
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");   //Objeto podcast
        miPodcast.setTitulo("Cafe.Tech");

        //Cancion
        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();            //Loops para subir valor de repro. y likes
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }
        //Podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();            //Loops para subir valor de repro. y likes
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Me gusta: " + miCancion.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicion(miPodcast);
        favoritos.adicion(miCancion);
    }
}

