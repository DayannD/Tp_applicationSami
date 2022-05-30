/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.myexpoonline.store.frontoffice;

import com.myexpoonline.store.core.entity.Author;
import com.myexpoonline.store.core.entity.Catalogue;
import com.myexpoonline.store.core.entity.Work;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FiercePC
 */
@WebServlet(name = "CatalogueServlet", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CatalogueServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CatalogueServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
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
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
