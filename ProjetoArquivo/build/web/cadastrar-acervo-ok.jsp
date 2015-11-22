
<%@page import="dao.AcervoDAO"%>
<%@page import="modelo.Acervo"%>
<%@include file = "cabecalho.jsp" %>

<%

    String acervo = request.getParameter("txtAcervo");
    String descricao = request.getParameter("txtDescricao");

    AcervoDAO dao = new AcervoDAO();

    Acervo obj = new Acervo();
    
    obj.setDescricaoAcervo(descricao);
    
    dao.incluir(obj);
    


%>


<div>

    <%--  aqui vai o texto da página --%>

    <h3> Cadastro de Acervo </h3> 


    <p> O registro foi cadastrado com sucesso. </p>

    <a href = "index.jsp" > Voltar para o Início </a>


</div>







