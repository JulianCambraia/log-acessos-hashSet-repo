package model.entities;

import java.util.Date;

/**
 * 
 * @author julian
 * 
 *         Exemplo arquivo .CSV amanda 2018-08-26T20:45:08Z alex86
 *         2018-08-26T21:49:37Z bobbrown 2018-08-27T03:19:13Z amanda
 *         2018-08-27T08:11:00Z jeniffer3 2018-08-27T09:19:24Z alex86
 *         2018-08-27T22:39:52Z amanda 2018-08-28T07:42:19Z
 */
public class LogAcessos {
	private String nome;
	private Date dataAcesso;

	public LogAcessos() {
		super();
	}

	public LogAcessos(String nome, Date dataAcesso) {
		super();
		this.nome = nome;
		this.dataAcesso = dataAcesso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAcesso() {
		return dataAcesso;
	}

	public void setDataAcesso(Date dataAcesso) {
		this.dataAcesso = dataAcesso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogAcessos other = (LogAcessos) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
