package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Acervo;
import modelo.Usuario;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-11-21T22:24:23")
@StaticMetamodel(Pesquisa.class)
public class Pesquisa_ { 

    public static volatile SingularAttribute<Pesquisa, String> finalidadePesq;
    public static volatile SingularAttribute<Pesquisa, String> temaPesq;
    public static volatile SingularAttribute<Pesquisa, String> instrumentoPesq;
    public static volatile SingularAttribute<Pesquisa, Usuario> idUsu;
    public static volatile SingularAttribute<Pesquisa, Acervo> idAcervo;
    public static volatile SingularAttribute<Pesquisa, Date> dataPesq;
    public static volatile SingularAttribute<Pesquisa, Long> idPesq;

}