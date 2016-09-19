package br.com.fiap.rs.exemplo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value="alunows")
public class AlunoWeb {

	static private List<Aluno> alunos;
	
	static{
		alunos = new ArrayList<>();
		alunos.add(new Aluno("thiago", "27SCJ", 10.0));
		alunos.add(new Aluno("Pombo", "27SCJ", 10.0));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Aluno> getAlunos(){
		return alunos;
	}
	@Path("{indice}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Aluno getAluno(@PathParam("indice") int indice){
		return alunos.get(indice);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Retorno novo(Aluno a){
		alunos.add(a);
		Retorno r = new Retorno();
		r.setMensagem("Aluno cadastrado com sucesso!");
		
		return r;
	}
	
	@Path("{indice}")
	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	public Retorno remover(@PathParam("indice")int indice){
		alunos.remove(indice);
		Retorno r = new Retorno();
		r.setMensagem("Aluno removido com sucesso!");
		
		return r;
	}
	
	
	@Path("{indice}")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Retorno atualizar(Aluno aluno, @PathParam("indice")int indice){
		alunos.set(indice, aluno);
		Retorno r = new Retorno();
		r.setMensagem("Aluno atualizado com sucesso!");
		
		return r;
	}
}
