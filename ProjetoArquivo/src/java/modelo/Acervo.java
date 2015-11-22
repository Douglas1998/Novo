/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "acervo")
@NamedQueries({
    @NamedQuery(name = "Acervo.findAll", query = "SELECT a FROM Acervo a")})
public class Acervo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_acervo")
    private Long idAcervo;
    @Basic(optional = false)
    @Column(name = "descricao_acervo")
    private String descricaoAcervo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idAcervo")
    private Collection<Pesquisa> pesquisaCollection;

    public Acervo() {
    }

    public Acervo(Long idAcervo) {
        this.idAcervo = idAcervo;
    }

    public Acervo(Long idAcervo, String descricaoAcervo) {
        this.idAcervo = idAcervo;
        this.descricaoAcervo = descricaoAcervo;
    }

    public Long getIdAcervo() {
        return idAcervo;
    }

    public void setIdAcervo(Long idAcervo) {
        this.idAcervo = idAcervo;
    }

    public String getDescricaoAcervo() {
        return descricaoAcervo;
    }

    public void setDescricaoAcervo(String descricaoAcervo) {
        this.descricaoAcervo = descricaoAcervo;
    }

    public Collection<Pesquisa> getPesquisaCollection() {
        return pesquisaCollection;
    }

    public void setPesquisaCollection(Collection<Pesquisa> pesquisaCollection) {
        this.pesquisaCollection = pesquisaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAcervo != null ? idAcervo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Acervo)) {
            return false;
        }
        Acervo other = (Acervo) object;
        if ((this.idAcervo == null && other.idAcervo != null) || (this.idAcervo != null && !this.idAcervo.equals(other.idAcervo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Acervo[ idAcervo=" + idAcervo + " ]";
    }
    
}
