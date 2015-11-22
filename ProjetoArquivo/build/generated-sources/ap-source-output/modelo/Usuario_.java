package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Pesquisa;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-11-21T22:24:23")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> localtrabalhoUsu;
    public static volatile SingularAttribute<Usuario, Date> datanascUsu;
    public static volatile SingularAttribute<Usuario, String> instituiÇÃiusu;
    public static volatile SingularAttribute<Usuario, Long> idUsu;
    public static volatile SingularAttribute<Usuario, String> ciUsu;
    public static volatile SingularAttribute<Usuario, String> nomeUsu;
    public static volatile SingularAttribute<Usuario, String> cepUsu;
    public static volatile SingularAttribute<Usuario, String> cpfUsu;
    public static volatile SingularAttribute<Usuario, String> ocupacaoUsu;
    public static volatile SingularAttribute<Usuario, String> enderecoUsu;
    public static volatile SingularAttribute<Usuario, String> emailUsu;
    public static volatile CollectionAttribute<Usuario, Pesquisa> pesquisaCollection;

}