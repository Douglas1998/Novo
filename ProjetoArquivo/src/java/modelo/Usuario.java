/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")})
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_usu")
    private Long idUsu;
    @Basic(optional = false)
    @Column(name = "nome_usu")
    private String nomeUsu;
    @Basic(optional = false)
    @Column(name = "datanasc_usu")
    @Temporal(TemporalType.DATE)
    private Date datanascUsu;
    @Basic(optional = false)
    @Column(name = "ci_usu")
    private String ciUsu;
    @Basic(optional = false)
    @Column(name = "cpf_usu")
    private String cpfUsu;
    @Basic(optional = false)
    @Column(name = "endereco_usu")
    private String enderecoUsu;
    @Basic(optional = false)
    @Column(name = "cep_usu")
    private String cepUsu;
    @Basic(optional = false)
    @Column(name = "email_usu")
    private String emailUsu;
    @Basic(optional = false)
    @Column(name = "ocupacao_usu")
    private String ocupacaoUsu;
    @Basic(optional = false)
    @Column(name = "localtrabalho_usu")
    private String localtrabalhoUsu;
    @Basic(optional = false)
    @Column(name = "institui\u00c7\u00c3i_usu")
    private String instituiÇÃiusu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUsu")
    private Collection<Pesquisa> pesquisaCollection;

    public Usuario() {
    }

    public Usuario(Long idUsu) {
        this.idUsu = idUsu;
    }

    public Usuario(Long idUsu, String nomeUsu, Date datanascUsu, String ciUsu, String cpfUsu, String enderecoUsu, String cepUsu, String emailUsu, String ocupacaoUsu, String localtrabalhoUsu, String instituiÇÃiusu) {
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.datanascUsu = datanascUsu;
        this.ciUsu = ciUsu;
        this.cpfUsu = cpfUsu;
        this.enderecoUsu = enderecoUsu;
        this.cepUsu = cepUsu;
        this.emailUsu = emailUsu;
        this.ocupacaoUsu = ocupacaoUsu;
        this.localtrabalhoUsu = localtrabalhoUsu;
        this.instituiÇÃiusu = instituiÇÃiusu;
    }

    public Long getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Long idUsu) {
        this.idUsu = idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public Date getDatanascUsu() {
        return datanascUsu;
    }

    public void setDatanascUsu(Date datanascUsu) {
        this.datanascUsu = datanascUsu;
    }

    public String getCiUsu() {
        return ciUsu;
    }

    public void setCiUsu(String ciUsu) {
        this.ciUsu = ciUsu;
    }

    public String getCpfUsu() {
        return cpfUsu;
    }

    public void setCpfUsu(String cpfUsu) {
        this.cpfUsu = cpfUsu;
    }

    public String getEnderecoUsu() {
        return enderecoUsu;
    }

    public void setEnderecoUsu(String enderecoUsu) {
        this.enderecoUsu = enderecoUsu;
    }

    public String getCepUsu() {
        return cepUsu;
    }

    public void setCepUsu(String cepUsu) {
        this.cepUsu = cepUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public String getOcupacaoUsu() {
        return ocupacaoUsu;
    }

    public void setOcupacaoUsu(String ocupacaoUsu) {
        this.ocupacaoUsu = ocupacaoUsu;
    }

    public String getLocaltrabalhoUsu() {
        return localtrabalhoUsu;
    }

    public void setLocaltrabalhoUsu(String localtrabalhoUsu) {
        this.localtrabalhoUsu = localtrabalhoUsu;
    }

    public String getInstituiÇÃiusu() {
        return instituiÇÃiusu;
    }

    public void setInstituiÇÃiusu(String instituiÇÃiusu) {
        this.instituiÇÃiusu = instituiÇÃiusu;
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
        hash += (idUsu != null ? idUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsu == null && other.idUsu != null) || (this.idUsu != null && !this.idUsu.equals(other.idUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Usuario[ idUsu=" + idUsu + " ]";
    }
    
}
