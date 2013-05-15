package views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n\t<title>Cruzeiras</title>\n\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n\n\t<link href=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-combined.min.css\" rel=\"stylesheet\" media=\"screen\">\n\n\t<style type=\"text/css\">\n      body {\n        padding-top: 40px;\n        padding-bottom: 40px;\n        background-color: #f5f5f5;\n      }\n\n      /* Custom container */\n      .container-narrow {\n        margin: 0 auto;\n        max-width: 700px;\n      }\n      .container-narrow > hr {\n        margin: 30px 0;\n      }\n    </style>\n</head>\n<body>\n\n<a href=\"https://github.com/fabiofalci/cruzeira\"><img style=\"position: absolute; top: 0; right: 0; border: 0;\" src=\"https://s3.amazonaws.com/github/ribbons/forkme_right_green_007200.png\" alt=\"Fork me on GitHub\"></a>\n<div class=\"container-narrow\">\n     <div class=\"masthead\">\n        <h3 class=\"muted\">Cruzeira</h3>\n    </div>\n\n     <div class=\"row-fluid marketing\">\n     \t<h4>About</h4>\n     \t<p>\n     \t\tCruzeira project is an attempt to enable Spring web application to run on Netty.io implementing a subset of the Servlet API.\n");
      out.write("     \t</p>\n     </div>\n     <div class=\"row-fluid marketing\">\n     \t<h4>Status</h4>\n     \t<p>\n     \t\tIt's on a very early stage without any release yet. It's pretty much an experimental work in progress.\n     \t</p>\n     </div>\n     <div class=\"row-fluid marketing\">\n     \t<h4>Code</h4>\n     \t<p>\n     \t\tIt's a regular web project without a web.xml.\n     \t\tIt configures Spring programmatically using app-context.xml from resources directory. Creating a project\n     \t\tusing cruzeira archetype will give you this structure:\n     \t</p>\n     \t<p>\n     \t\t<img alt=\"project\" src=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\">\n     \t</p>\n     \t<p>\n     \t\tTo start the application execute: \n     \t</p>\n     \t<p>\n     \t\t<code>mvn compile exec:exec:</code> \n     \t</p>\n     \t<p>\n     \t\tWhen the following message appears then the application is up:\n     \t</p>\n     \t<p>\n     \t\t<code>23:22:58 [main] INFO  Bootstrap - Running cruzeira 8080...</code> \n     \t</p>\n     </div>\n     <div class=\"row-fluid marketing\">\n     \t<h4>Spring</h4>\n     \t<p>\n     \t\tIt's a regular Spring web application with beans, xmls, aop, database access, etc. Therefore you\n     \t\tcan use any Spring feature normally, in the Spring way, except the web views. To make things simple the\n     \t\tJSP files are in 'src/main/java/views'. \n     \t</p>\n     \t<p>\n     \t\t<img alt=\"project\" src=\"");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\">\n     \t</p>\n     \t<p>\n     \t\tThen the jsp file will be compiled to a Java class in the first execution and Maven will compile this\n     \t\tgenerated Java class. At the end, you will have this:\n     \t</p>\n     \t<p>\n     \t\t<img alt=\"project\" src=\"");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\">\n     \t</p>\n     \t<p>\n     \t\tIf you are curious you can open this Java class and see the result of a JSP file, what is really executed.\n     \t</p>\n     </div>\n\t <div class=\"row-fluid marketing\">\n     \t<h4>Reload</h4>\n     \t<p>\n     \t\tAs a big fan of Play! Framework one of the first implemented feature was the automatic reload. Instead\n     \t\tof stop and start manually every time, Cruzeira watches for changes in the file system and \n     \t\tthen restart the Spring application automatically. It'll not restart the Netty server but only the \n     \t\tapplication.\n     \t</p>\n     </div>\n     <div class=\"row-fluid marketing\">\n     \t<h4>Github</h4>\n     \t<p>\n     \t\tGithub project: <a href=\"https://github.com/fabiofalci/cruzeira\">Cruzeira</a>\n     \t</p>\n     \t<p>Stay tuned for news!</p>\n     </div>\n     <hr>\n\n     <div class=\"footer\">\n     \tThis site is a Spring web application running on top of Netty on Heroku.\n     </div>\n</div>\n\n<script src=\"http://code.jquery.com/jquery-1.9.1.min.js\"></script>\n<script src=\"http://malsup.github.com/jquery.form.js\"></script> \n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/js/bootstrap.min.js\"></script>\n</body>\n</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/base-project.png");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/resources/views-jsp.png");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/views-jsp-compiled.png");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }
}
