package com.ceica.tareasweb.servlets;

import com.ceica.tareasweb.models.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "adminServlet", value = "/admin")
public class AdminServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        User user = (User) request.getSession().getAttribute("user");
        if (user==null){
            response.sendRedirect("login");
        } else {
            if(user.getRol().getDescription().equals("admin")){
                request.setAttribute("name",user.getUsername());
                request.getRequestDispatcher("admin.jsp").forward(request,response);
            }else{
                response.sendRedirect("user");
            }
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

    }
}