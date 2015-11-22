<%@page import="dao.AcervoDAO"%>
<%@page import="modelo.Acervo"%>
<%@page import="java.util.List"%>
<%@include file = "cabecalho.jsp" %>
<%
    AcervoDAO dao = new AcervoDAO();
    List<Acervo> acervos = dao.listar();


%>
<html>


    <div>

        <%--  aqui vai o texto do acevro --%>

        <h3> Acervo </h3> 

        <a href = "cadastrar-acervo.jsp">  <b>  Novo Acervo  </b> </a> 

        </br>
        </br> 


        <input type = "text" name = "txtMeem" /> <br />  <button> Pesquisar </button>


        <table border = "5" width = "10px" height = "25px" bgcolor = white>

            <tr>
                <td> Acervo </td>
                <td> Descrição </td>
                <td> Ações </td>



            </tr>
            <tr>
                <td>1</td>
                <td>xxxxxx</td>
                <td>99</td>


            </tr>




            <%                for (Acervo ac : acervos) {


            %>

            <tr>

                <td> <%=ac.getDescricaoAcervo()%> </td>
                <td> <%=ac.getIdAcervo()%></td>
                <td> 2 </td>

                <td> <a href ="editar-acervo.jsp?descricao=<%=ac.getDescricaoAcervo()%>"> Editar </a>
                    <a href="exluir-acervo-ok.jsp?descricao=<%=ac.getDescricaoAcervo()%>"> Excluir </a> 
                </td>




            </tr>

            <%

                }
            %>








        </table>

    </div>

</body>
</html>

