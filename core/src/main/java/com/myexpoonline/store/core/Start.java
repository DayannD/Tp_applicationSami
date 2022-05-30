/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myexpoonline.store.core;

/**
 *
 * @author FiercePC
 */

import com.myexpoonline.store.core.entity.Author;
import com.myexpoonline.store.core.entity.Work;
import com.myexpoonline.store.core.entity.Catalogue;

/**
 *
 * @author samihhabbani
 */
public class Start {
    
        public static void main(String... args) {
        
        // Il faut alimenter notre HashSet avec des oeuvres
    
        // Création des auteurs
        Author pabloPicasso = new Author("Pablo Picasso");
        Author vanGogh = new Author("Van Gogh");
        Author claudeMonet = new Author("Claude Monet");

        //Création des oeuvres

        Work guernica = new Work("Guernica");
        Work tournesols = new Work("Les tournesols");
        Work promenade = new Work("La promenade");

        // Infos sur les oeuvres  
        guernica.setDescription("Guernica est une peinture du peintre espagnol Pablo Picasso, une de ses œuvres les plus célèbres et un des tableaux les plus connus au monde.");
        tournesols.setDescription("En vérité, ces 'Tournesols' sont la personnification végétale de l'Homme. Le peintre a en effet composé un bouquet fait de fleurs à tous les stades d'évolution : en bouton, épanouies, fanées, en graines…");
        promenade.setDescription("La ligne d'horizon basse et la position du corps contre le ciel donnent à la figure une sensation de monumentalité qui est inhabituelle dans les peintures de Monet du milieu des années 1870. ...");
        
        guernica.setYear(1937);
        tournesols.setYear(1888);
        promenade.setYear(1875);
        
        guernica.setStyle("Cubisme");
        tournesols.setStyle("Art moderne");
        promenade.setStyle("Impressionisme");
        
        guernica.setAuthor(pabloPicasso);
        tournesols.setAuthor(vanGogh);
        promenade.setAuthor(claudeMonet);
        
        // Ajouter les oeuvres au catalogue
        
        Catalogue.listOfWorks.add(guernica);
        Catalogue.listOfWorks.add(tournesols);
        Catalogue.listOfWorks.add(promenade);
        
        for(Work work : Catalogue.listOfWorks) {
            System.out.println(work.getTitle() + " (" + work.getYear()  + " )");
        }
        
    }
    
}
