/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.11
 * Generated at: 2023-11-09 04:12:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.template;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.trabajouy.model.EstadoSesion;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/media/styles/headerandreset.css", Long.valueOf(1699477528000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.trabajouy.model.EstadoSesion");
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<style>\r\n");
      out.write("            ");
      out.write("a:link,\r\n");
      out.write("a:visited,\r\n");
      out.write("a:active,\r\n");
      out.write("a:hover {\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    font-family: 'Montserrat', sans-serif;    \r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    \r\n");
      out.write("    background-color: #f3f4f6;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  header {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding: 1px 1%;\r\n");
      out.write("    \r\n");
      out.write("    flex-wrap: wrap;\r\n");
      out.write("    background-color: #3f838c;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .logo {\r\n");
      out.write("    margin: 1em;\r\n");
      out.write("    width: 200px;\r\n");
      out.write("    transition: opacity 0.3s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .logo:hover {\r\n");
      out.write("    opacity: 0.8;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .search-box {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    gap: 10px; /* ReducciÃ³n del espacio entre elementos */\r\n");
      out.write("    border-radius: 25px; /* Bordes un poco mÃ¡s reducidos */\r\n");
      out.write("    background-color: #f1f3f5;\r\n");
      out.write("    padding: 8px 15px; /* Padding reducido */\r\n");
      out.write("    box-shadow: 0 5px 30px rgba(40, 102, 110, 0.1);\r\n");
      out.write("    border: 0.12em solid #03045E;\r\n");
      out.write("    width: 70%; /* Ancho reducido al 70% */\r\n");
      out.write("    max-width: 600px; /* Ancho mÃ¡ximo reducido */\r\n");
      out.write("    margin: auto;\r\n");
      out.write("    transition: all 0.3s ease;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .search-box:hover {\r\n");
      out.write("    box-shadow: 0 7px 40px rgba(40, 102, 110, 0.15);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .search-box input[type=\"text\"] {\r\n");
      out.write("    flex: 1;\r\n");
      out.write("    padding: 8px; /* Padding reducido */\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 20px; /* Bordes un poco mÃ¡s reducidos */\r\n");
      out.write("    outline: none;\r\n");
      out.write("    font-size: 1em; /* TamaÃ±o de fuente estÃ¡ndar */\r\n");
      out.write("    font-family: 'Arial', sans-serif;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    transition: box-shadow 0.3s, background-color 0.3s;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .search-box input[type=\"text\"]:focus {\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.7);\r\n");
      out.write("    box-shadow: inset 0 1px 4px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .search-button {\r\n");
      out.write("    padding: 8px 20px; /* Padding reducido */\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 20px; /* Bordes un poco mÃ¡s reducidos */\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    font-size: 1em; /* TamaÃ±o de fuente estÃ¡ndar */\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    font-family: 'Arial', sans-serif;\r\n");
      out.write("    background-color: #28666e;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    box-shadow: 0 4px 20px rgba(0, 0, 0, 0.15);\r\n");
      out.write("    transition: all 0.3s ease;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .search-button:hover, .search-button:focus {\r\n");
      out.write("    background-color: #0077B6;\r\n");
      out.write("    transform: translateY(-2px); /* Efecto ligeramente reducido */\r\n");
      out.write("    box-shadow: 0 5px 25px rgba(0, 0, 0, 0.2);\r\n");
      out.write("  }\r\n");
      out.write("  .search-box {\r\n");
      out.write("    animation: slideUp 0.5s ease forwards;\r\n");
      out.write("  }\r\n");
      out.write("  @keyframes slideUp {\r\n");
      out.write("    from {\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("        transform: translateY(20px);\r\n");
      out.write("    }\r\n");
      out.write("    to {\r\n");
      out.write("        opacity: 1;\r\n");
      out.write("        transform: translateY(0);\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  .header-title {\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("    font-size: 1.7em;\r\n");
      out.write("    padding: 1em;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    color: #28666e; /* Color oscuro para el tÃ­tulo */\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .buttons-section {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    gap: 10px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-button,\r\n");
      out.write("  .register-button {\r\n");
      out.write("    padding: 10px 15px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("    /* Ajustado para que la transiciÃ³n se aplique sobre la propiedad 'background-color' */\r\n");
      out.write("    letter-spacing: 0.5px;\r\n");
      out.write("    /* Espaciado entre letras para un aspecto mÃ¡s estilizado */\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-button {\r\n");
      out.write("    background-color: #28666e;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    /* Sombra suave para darle profundidad */\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .login-button:hover {\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    color: black;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .register-button {\r\n");
      out.write("    background-color: #28666e;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("    /* Color principal para el texto */\r\n");
      out.write("    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    /* Sombra suave */\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .register-button:hover {\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    color: black;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .profile-section {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    justify-content: center;\r\n");
      out.write("    gap: 1rem;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .profile-section button {\r\n");
      out.write("    padding: 10px 15px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("    /* Ajustado para que la transiciÃ³n se aplique sobre la propiedad 'background-color' */\r\n");
      out.write("    letter-spacing: 0.5px;\r\n");
      out.write("    background-color: #28666e;\r\n");
      out.write("    color: #ffffff;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .profile-section button:hover {\r\n");
      out.write("    background-color: #ffffff;\r\n");
      out.write("    transition-duration: 100ms;\r\n");
      out.write("    color: rgb(0, 0, 0);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .profile-section div {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    padding-right: 0.5rem;\r\n");
      out.write("    gap: 0.5rem;\r\n");
      out.write("    color: white;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .profile-section div:hover {\r\n");
      out.write("    opacity: 0.8;\r\n");
      out.write("    transition: 100ms;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .profile-section img {\r\n");
      out.write("    width: 50px;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    border: 3px black solid;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("  }\r\n");
      out.write("  ");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <header>\r\n");
      out.write("            <a href=\"home\"><img id=\"logo\" class=\"logo\" src=\"media/images/logo.png\"\r\n");
      out.write("                    alt=\"Logo de la empresa\"></a>\r\n");
      out.write("                   <div class=\"buttons-section\">\r\n");
      out.write("		\r\n");
      out.write("		<!--<form action=\"/trabajouy/home\"	 method=\"post\">\r\n");
      out.write("			<input type=\"hidden\" name=\"botonPresionado\" value=\"true\">\r\n");
      out.write("			<button class=\"login-button\" type=\"submit\">Cargar Datos</button>\r\n");
      out.write("		</form>-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("            <div class=\"search-box\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"Buscar...\">\r\n");
      out.write("                <button class=\"search-button\">Buscar</button>\r\n");
      out.write("            </div>\r\n");
      out.write("    \r\n");
      out.write("            \r\n");
      out.write("            ");

           EstadoSesion sesion = (EstadoSesion) request.getSession().getAttribute("estado_sesion"); 
            if(sesion == null || sesion == EstadoSesion.VISITANTE){
            
      out.write("\r\n");
      out.write("            <div class=\"buttons-section\">\r\n");
      out.write("                <a href=\"login\"><button class=\"login-button\">Iniciar sesión</button></a>\r\n");
      out.write("                <a href=\"register\"><button class=\"register-button\">Registrarse</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
 } else if (sesion == EstadoSesion.EMPRESA || sesion == EstadoSesion.POSTULANTE){
            	String nickname = (String) request.getSession().getAttribute("nickname_sesion");
            	
      out.write("\r\n");
      out.write("           <div class=\"profile-section\">\r\n");
      out.write("            <a href=\"perfil\">\r\n");
      out.write("                <div id=\"header-to-profile\">\r\n");
      out.write("                ");
 String foto = (String) request.getSession().getAttribute("foto_sesion");
                System.out.println(foto);
                
      out.write("\r\n");
      out.write("                    <img id=\"profile-photo\" src=\"/trabajouy/media/images/");
      out.print(foto);
      out.write("\"/>\r\n");
      out.write("                    <p id=\"header-nickname\"><b>");
      out.print( nickname);
      out.write("</b></p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </a>\r\n");
      out.write("            <form action=\"/trabajouy-0.0.1-SNAPSHOT/home\" method = \"post\">\r\n");
      out.write("            <button>Cerrar Sesión</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        </header>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
