/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Douglas
 */
@Entity
@Table(name = "pesquisa")
@NamedQueries({
    @NamedQuery(name = "Pesquisa.findAll", query = "SELECT p FROM Pesquisa p")})
public class Pesquisa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pesq")
    private Long idPesq;
    @Basic(optional = false)
    @Column(name = "data_pesq")
    @Temporal(TemporalType.DATE)
    private Date dataPesq;
    @Basic(optional = false)
    @Column(name = "tema_pesq")
    private String temaPesq;
    @Basic(optional = false)
    @Column(name = "instrumento_pesq")
    private String instrumentoPesq;
    @Basic(optional = false)
    @Column(name = "finalidade_pesq")
    private String finalidadePesq;
    @JoinColumn(name = "id_usu", referencedColumnName = "id_usu")
    @ManyToOne(optional = false)
    private Usuario idUsu;
    @JoinColumn(name = "id_acervo", referencedColumnName = "id_acervo")
    @ManyToOne(optional = false)
    private Acervo idAcervo;

    public Pesquisa() {
    }

    public Pesquisa(Long idPesq) {
        this.idPesq = idPesq;
    }

    public Pesquisa(Long idPesq, Date dataPesq, String temaPesq, String instrumentoPesq, String finalidadePesq) {
        this.idPesq = idPesq;
        this.dataPesq = dataPesq;
        this.temaPesq = temaPesq;
        this.instrumentoPesq = instrumentoPesq;
        this.finalidadePesq = finalidadePesq;
    }

    public Long getIdPesq() {
        return idPesq;
    }

    public void setIdPesq(Long idPesq) {
        this.idPesq = idPesq;
    }

    public Date getDataPesq() {
        return dataPesq;
    }

    public void setDataPesq(Date dataPesq) {
        this.dataPesq = dataPesq;
    }

    public String getTemaPesq() {
        return temaPesq;
    }

    public void setTemaPesq(String temaPesq) {
        this.temaPesq = temaPesq;
    }

    public String getInstrumentoPesq() {
        return instrumentoPesq;
    }

    public void setInstrumentoPesq(String instrumentoPesq) {
        this.instrumentoPesq = instrumentoPesq;
    }

    public String getFinalidadePesq() {
        return finalidadePesq;
    }

    public void setFinalidadePesq(String finalidadePesq) {
        this.finalidadePesq = finalidadePesq;
    }

    public Usuario getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(Usuario idUsu) {
        this.idUsu = idUsu;
    }

    public Acervo getIdAcervo() {
        return idAcervo;
    }

    public void setIdAcervo(Acervo idAcervo) {
        this.idAcervo = idAcervo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPesq != null ? idPesq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pesquisa)) {
            return false;
        }
        Pesquisa other = (Pesquisa) object;
        if ((this.idPesq == null && other.idPesq != null) || (this.idPesq != null && !this.idPesq.equals(other.idPesq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Pesquisa[ idPesq=" + idPesq + " ]";
    }
    
}
