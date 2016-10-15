package com.company.surveymanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.igate.surveymanagement.bean.SurveyMasterBean;
import com.igate.surveymanagement.bean.SurveyQuestionAnswerBean;
import com.igate.surveymanagement.service.ISurveyManagementSystemServ;
import com.igate.surveymanagement.service.SurveyManagementSystemServ;
import com.sun.mail.handlers.message_rfc822;

/**
 * Servlet implementation class SurveyController
 */
public class SurveyController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	
		doPost(req, resp);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri = request.getRequestURI();
		ISurveyManagementSystemServ sms = new SurveyManagementSystemServ();
		RequestDispatcher disp;
		SurveyMasterBean cr;
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		List<SurveyMasterBean> sList = new ArrayList<SurveyMasterBean>();
		SurveyQuestionAnswerBean sbn=null; 
		SurveyQuestionAnswerBean sbn1=null;
		if(uri.contains("createSurvey"))
		{
			cr = new SurveyMasterBean();
			cr.setSurveyTitle(request.getParameter("surveyTitleTxt"));
			cr.setSurveyDesc(request.getParameter("surveyDescTxt"));
			int surveyId = sms.createSurvry(cr);
			sList = sms.getSurveyByUser(1);
			//request.setAttribute("surveyId", surveyId);
			request.setAttribute("sList", sList);
			disp = request.getRequestDispatcher("SurveyerHome.jsp");
			disp.forward(request, response);
		}else if(uri.contains("newquestionfields"))
		{
			//
			
		}else if(uri.contains("login"))
		{
			session = request.getSession(true);
			List<SurveyQuestionAnswerBean> cart = 
				(List<SurveyQuestionAnswerBean>) session.getAttribute("cart");
			if(cart == null)
			{
				cart = new ArrayList<SurveyQuestionAnswerBean>();
				session.setAttribute("cart", cart);
				session.setMaxInactiveInterval(10);
			}
			sList = sms.getSurveyByUser(1);
			request.setAttribute("sList", sList);
			disp = request.getRequestDispatcher("SurveyerHome.jsp");
			disp.forward(request, response);
		}else if(uri.contains("addquestions"))
		{	
			
		/*	sbn = new SurveyQuestionAnswerBean();
			sbn.setSurveyId(Integer.parseInt(request.getParameter("surveyId")));
			session.setAttribute("crid", sbn);*/
			disp = request.getRequestDispatcher("AddQuestion.jsp");
			disp.forward(request, response);
		}else if(uri.contains("SaveQuestions"))
		{
			session = request.getSession(true);
			List<SurveyQuestionAnswerBean> cart = 
				(List<SurveyQuestionAnswerBean>) session.getAttribute("cart");
			sbn = (SurveyQuestionAnswerBean) session.getAttribute("crid");
			
			Iterator<SurveyQuestionAnswerBean> it = cart.iterator();
			
			while(it.hasNext())
			{
				sbn1 = new SurveyQuestionAnswerBean();
				SurveyQuestionAnswerBean a = it.next();
				sbn1.setSurveyId(sbn.getSurveyId());
				sbn1.setQuestion(a.getQuestion());
				sbn1.setOption1(a.getOption1());
				sbn1.setOption2(a.getOption2());
				sbn1.setOption3(a.getOption3());
				sbn1.setOption4(a.getOption4());
				
				sms.createQuestion(sbn1);
				
			}
			
		
		
			
		}
	}

}
