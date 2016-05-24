package com.org.smacna.resources;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class GutterDownspoutSmacnaServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
