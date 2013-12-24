package modelo.operacao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Operacao {
	@Id
	private String IdOperacao;
	private String IdCFOPIntraUF;
	private String IdCFOPEntreUF;
	private String IdCFOPExterior;
	private String StCalculaIPI;
	private String StCalculaICMS;
	
	
	public String getStCalculaIPI() {
		return StCalculaIPI;
	}
	public void setStCalculaIPI(String stCalculaIPI) {
		StCalculaIPI = stCalculaIPI;
	}
	public String getStCalculaICMS() {
		return StCalculaICMS;
	}
	public void setStCalculaICMS(String stCalculaICMS) {
		StCalculaICMS = stCalculaICMS;
	}
	public String getIdOperacao() {
		return IdOperacao;
	}
	public void setIdOperacao(String idOperacao) {
		IdOperacao = idOperacao;
	}
	public String getIdCFOPIntraUF() {
		return IdCFOPIntraUF;
	}
	public void setIdCFOPIntraUF(String idCFOPIntraUF) {
		IdCFOPIntraUF = idCFOPIntraUF;
	}
	public String getIdCFOPEntreUF() {
		return IdCFOPEntreUF;
	}
	public void setIdCFOPEntreUF(String idCFOPEntreUF) {
		IdCFOPEntreUF = idCFOPEntreUF;
	}
	public String getIdCFOPExterior() {
		return IdCFOPExterior;
	}
	public void setIdCFOPExterior(String idCFOPExterior) {
		IdCFOPExterior = idCFOPExterior;
	}
	
	
}
