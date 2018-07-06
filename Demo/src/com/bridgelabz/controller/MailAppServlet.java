package com.bridgelabz.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MailAppServlet extends HttpServlet {
	private static final long serialVersionUID = -4107894134507906062L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		SendMail.send(email);
		System.out.println("send email successfully");
	}
}