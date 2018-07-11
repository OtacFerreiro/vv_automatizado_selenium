package br.unipe.tests.mockTests;

import static org.junit.Assert.assertTrue;

import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import br.unipe.teste.model.CalculadoraDesconto;
import br.unipe.teste.model.Cliente;
import br.unipe.teste.model.Produto;

public class CalcularDescontoMockTest extends EasyMockSupport {
	
	public static final Double VALOR_PRODUTO = 1000d;
	public static final Integer QDADE_X_PRODUTO = 10;
	public static final Integer QDADE_Y_PRODUTO = 100;
	public static final Integer QDADE_Z_PRODUTO = 1000;
	
	public static final String CLIENTE_A = "A";
	public static final String CLIENTE_B = "B";
	public static final String CLIENTE_C = "C";
	
	@Rule
	public EasyMockRule rule = new EasyMockRule(this);
	
	@Mock
	private Produto produto;
	
	@Mock
	private Cliente cliente;
	
	@TestSubject
	private final CalculadoraDesconto driver = new CalculadoraDesconto();
	
	@Test
	public void testCalcularValorComDescontoClienteAMenorQue100(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_A);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_A);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_X_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_X_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 900d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteAMaiorQue100MenorQue1000(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_A);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_A);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Y_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_Y_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 950d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteAMaiorQue1000(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_A);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_A);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Z_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_Z_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == VALOR_PRODUTO);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteBMenorQue100(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_B);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_B);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_X_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_X_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 850d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteBMaiorQue100MenorQue1000(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_B);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_B);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Y_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_Y_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 900d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteBMaiorQue1000(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_B);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_B);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Z_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_Z_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 950d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteCMenorQue100(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_C);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_C);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_X_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_X_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 800d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteCMaiorQue100MenorQue1000(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_C);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_C);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Y_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_Y_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 850d);
		
		verifyAll();
	}
	
	@Test
	public void testCalcularValorComDescontoClienteCMaiorQue1000(){		
		System.out.println(">>> TIPO CLIENTE: " + CLIENTE_C);
		System.out.println(">>> VALOR DO PRODUTO UTILIZADO: " + VALOR_PRODUTO);
		
		EasyMock.expect(cliente.getTipoCliente()).andReturn(CLIENTE_C);
		EasyMock.expect(produto.getValor()).andReturn(VALOR_PRODUTO);
		
		replayAll();
		
		System.out.println(">>> QUANTIDADE DO PRODUTO UTILIZADO: " + QDADE_Z_PRODUTO);
		
		driver.setCliente(cliente);
		driver.addProdutos(produto, QDADE_Z_PRODUTO);
		double valorComDesconto = driver.calcularDesconto(produto);
		
		System.out.println(">>> VALOR DO PRODUTO COM DESCONTO: " + valorComDesconto);
		
		assertTrue(valorComDesconto == 900d);
		
		verifyAll();
	}

}
