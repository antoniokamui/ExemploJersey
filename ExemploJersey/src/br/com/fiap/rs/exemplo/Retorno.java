package br.com.fiap.rs.exemplo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Retorno {
	private String mensagem;

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
