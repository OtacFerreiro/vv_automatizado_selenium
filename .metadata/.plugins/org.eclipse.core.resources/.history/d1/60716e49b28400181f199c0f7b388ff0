package br.unipe.tests.stubTests;

import static org.junit.Assert.assertTrue;

import org.easymock.EasyMockSupport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.unipe.teste.model.CalculadoraDesconto;
import br.unipe.teste.model.Cliente;
import br.unipe.teste.model.Produto;
import br.unipe.teste.stubs.ClienteAStub;
import br.unipe.teste.stubs.ClienteBStub;
import br.unipe.teste.stubs.ClienteCStub;
import br.unipe.teste.stubs.ProdutoStub;

public class CalcularDescontoStubTest extends EasyMockSupport {

	public static final Integer QDADE_X_PRODUTO = 10;
	public static final Integer QDADE_Y_PRODUTO = 100;
	public static final Integer QDADE_Z_PRODUTO = 1000;
	
	private CalculadoraDesconto calculadora;
	private Produto produto;
	
	@Before
	public void setup() {
		this.calculadora = new CalculadoraDesconto();
		this.produto = new ProdutoStub();
	}
	
	@After
	public void tearDown() {
		this.calculadora = null;
		this.produto = null;
	}
	
	@Test
	@Category(ClienteAStub.class)
	public void testCalcularValorComDescontoClienteAMenorQue100(){		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_X_PRODUTO);
		
		Cliente cliente = new ClienteAStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_X_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 900d);
	}
	
	@Test
	@Category(ClienteAStub.class)
	public void testCalcularValorComDescontoClienteAMaiorQue100MenorQue1000(){		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Y_PRODUTO);
		
		Cliente cliente = new ClienteAStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_Y_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 950d);
	}
	
	@Test
	@Category(ClienteAStub.class)
	public void testCalcularValorComDescontoClienteAMaiorQue1000(){		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Z_PRODUTO);
		
		Cliente cliente = new ClienteAStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_Z_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == produto.getValor());
	}
	
	@Test
	@Category(ClienteBStub.class)
	public void testCalcularValorComDescontoClienteBMenorQue100(){		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_X_PRODUTO);
		
		Cliente cliente = new ClienteBStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_X_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 850d);
	}
	
	@Test
	@Category(ClienteBStub.class)
	public void testCalcularValorComDescontoClienteBMaiorQue100MenorQue1000(){		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Y_PRODUTO);
		
		Cliente cliente = new ClienteBStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_Y_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 900d);	
	}
	
	@Test
	@Category(ClienteBStub.class)
	public void testCalcularValorComDescontoClienteBMaiorQue1000(){
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Z_PRODUTO);
		
		Cliente cliente = new ClienteBStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_Z_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 950d);
	}
	
	@Test
	@Category(ClienteCStub.class)
	public void testCalcularValorComDescontoClienteCMenorQue100(){				
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_X_PRODUTO);
		
		Cliente cliente = new ClienteCStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_X_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 800d);
	}
	
	@Test
	@Category(ClienteCStub.class)
	public void testCalcularValorComDescontoClienteCMaiorQue100MenorQue1000(){	
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Y_PRODUTO);
		
		Cliente cliente = new ClienteCStub();
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_Y_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 850d);
	}
	
	@Test
	@Category(ClienteCStub.class)
	public void testCalcularValorComDescontoClienteCMaiorQue1000(){		

		Cliente cliente = new ClienteCStub();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Z_PRODUTO);
		
		this.calculadora.setCliente(cliente);
		this.calculadora.addProdutos(produto, QDADE_Z_PRODUTO);
		double valorComDesconto = this.calculadora.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 900d);
	}
}
