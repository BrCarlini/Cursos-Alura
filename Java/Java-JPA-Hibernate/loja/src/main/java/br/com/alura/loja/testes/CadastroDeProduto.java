package br.com.alura.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.loja.dao.CategoriaDao;
import br.com.alura.loja.dao.ProdutoDao;
import br.com.alura.loja.modelo.Categoria;
import br.com.alura.loja.modelo.Produto;
import br.com.alura.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		
		cadastrarProduto();
		Long id = 1l;
		
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		
		//Busca por ID
		Produto produtoPorId = produtoDao.buscarPorId(id);
		System.out.println(produtoPorId.toString());
		
		
		//Busca todos da entidade Produto
		List<Produto> todos = produtoDao.buscarTodos();
		todos.forEach(p -> System.out.println(p.getNome()));
		
		
		//Busca pelo nome
		List<Produto> todosComONomeX = produtoDao.buscarPorNome("Xiaomi Redmi");
		todosComONomeX.forEach(p -> System.out.println(p.getNome()));
		
		
		//Busca pelo nome da categoria
		List<Produto> nomeCategoria = produtoDao.buscarPeloNomeDaCategoria("CELULARES");
		nomeCategoria.forEach(p -> System.out.println(p.getNome()));
		
		
		//Busca preco pelo nome do produto
		BigDecimal precoProduto = produtoDao.buscarPrecoDoProdutoComNome("Xiaomi Redmi");
		System.out.println(precoProduto);

	}
	
	
	
	public static void cadastrarProduto() {
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
		
		
		EntityManager em = JPAUtil.getEntityManager();
		
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		
		em.getTransaction().begin();
		
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		
		em.getTransaction().commit();
		em.close();
	}
	
	

}
