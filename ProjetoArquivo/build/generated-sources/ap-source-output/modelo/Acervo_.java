package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Pesquisa;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-11-21T22:24:23")
@StaticMetamodel(Acervo.class)
public class Acervo_ { 

    public static volatile SingularAttribute<Acervo, Long> idAcervo;
    public static volatile SingularAttribute<Acervo, String> descricaoAcervo;
    public static volatile CollectionAttribute<Acervo, Pesquisa> pesquisaCollection;

}