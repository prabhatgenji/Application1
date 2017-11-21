package com.nt.controller;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishViewController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Calendar cl=Calendar.getInstance();
		int hour=cl.get(Calendar.HOUR_OF_DAY);
		String msg=null;
		if(hour<12)
			msg="GOOD MORNING GAURAV";
			else if(hour<16)
				msg="GOOD afternoon GAURAV";
			else if(hour<20)
				msg="GOOD EVENING GAURAV";
			else 
				msg="GOOD NIGHT GAURAV";
		
		return new ModelAndView("result","wmsg", msg);
	}

}
