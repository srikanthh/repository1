package com.welcome;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Sample1Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Mwuuahhhaaaahahahahaha!!!!!!!");
	}
	//test by srk1
	//test by srk2
	// !@#$%^&*( by s3r :)
}
