package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.AcervoDAO;
import modelo.Acervo;
import java.util.List;

public final class acervo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/cabecalho.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <title> Sistema - Arquivo </title>\n");
      out.write("\n");
      out.write("    <p> <center>  <a href =\"index.jsp\">  <img src =\"arquivo.jpg\">  </a>  </p> \n");
      out.write("\n");
      out.write("\n");
      out.write("    <h1> Sistema de Cadastro de Usuários - Arquivo Público Municipal Tarcísio Taborda </h1>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("\n");
      out.write("        <a href =\"index.jsp\"> <b> Início </b> </a>\n");
      out.write("        </br>\n");
      out.write("        <a href =\"acervo.jsp\">  <b>  Acervo  </b> </a> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <img src =\"arquivo2.jpg\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    AcervoDAO dao = new AcervoDAO();
    List<Acervo> acervos = dao.listar();



      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <h3> Acervo </h3> \n");
      out.write("\n");
      out.write("        <a href = \"cadastrar-acervo.jsp\">  <b>  Novo Acervo  </b> </a> \n");
      out.write("\n");
      out.write("        </br>\n");
      out.write("        </br> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <input type = \"text\" name = \"txtMeem\" /> <br />  <button> Pesquisar </button>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <table border = \"5\" width = \"10px\" height = \"25px\" bgcolor = white>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td> Acervo </td>\n");
      out.write("                <td> Descrição </td>\n");
      out.write("                <td> Ações </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>1</td>\n");
      out.write("                <td>xxxxxx</td>\n");
      out.write("                <td>99</td>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
                for (Acervo ac : acervos) {


            
      out.write("\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("\n");
      out.write("                <td> ");
      out.print(ac.getDescricaoAcervo());
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(ac.getIdAcervo());
      out.write("</td>\n");
      out.write("                <td> 2 </td>\n");
      out.write("\n");
      out.write("                <td> <a href =\"editar-acervo.jsp?descricao=");
      out.print(ac.getDescricaoAcervo());
      out.write("\"> Editar </a>\n");
      out.write("                    <a href=\"exluir-acervo-ok.jsp?descricao=");
      out.print(ac.getDescricaoAcervo());
      out.write("\"> Excluir </a> \n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");


                }
            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
}
