package br.com.fiap.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;






public class TesteChamada {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args){
		/*Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("exemplo");
		Builder invocationBuilder = webTarget.request(MediaType.TEXT_PLAIN);
		
		Response response = invocationBuilder.get();
		
		String retorno = response.readEntity(String.class);
		System.out.println(retorno);*/
		
		
	/*	Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("alunos");
		Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		
		Response response = invocationBuilder.get();
		
		Alunos alunos = response.readEntity(Alunos.class);
		
		for(Aluno a: alunos.getAlunoList()){
			System.out.println(a.getNome());
			System.out.println(a.getTurma());
			System.out.println(a.getMedia());
		}
		*/
	
	/*	Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("alunos").path("1");
		Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		
		Response response = invocationBuilder.get();
		
		Aluno aluno = response.readEntity(Aluno.class);
		
		
			System.out.println(aluno.getNome());
			System.out.println(aluno.getTurma());
			System.out.println(aluno.getMedia());
		*/
		
		Aluno a = new Aluno();
		a.setNome("Dunha");
		a.setMedia(1.0);
		a.setTurma("27SCJ");
		
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://10.10.35.31:8080/ExemploJersey").path("alunos");
		Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
		
		Response response = invocationBuilder.post(Entity.entity(a, MediaType.APPLICATION_XML));
		
		Retorno r = response.readEntity(Retorno.class);
		
		System.out.println(r.getMensagem());
		
	
		
		
	}

}
