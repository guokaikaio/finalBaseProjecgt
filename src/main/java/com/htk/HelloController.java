package com.htk;

import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

public class HelloController extends Controller {

	public void index() {
		String email = getPara("email");
		String s = stringToAscii(email);
		renderText(s);
	}

	private String stringToAscii(String email) {
		String s = "";
		for (int i = 0; i < email.length(); i++) {
			char c=email.charAt(i);
			if(c<100) {
				s=s+("0"+(int)c);
			}else {
				s=s+(""+(int)c);
			}
		}
		return s;
	}

	@ActionKey("jsp")
	public void jsp() {

		render("index.jsp");
	}
}
