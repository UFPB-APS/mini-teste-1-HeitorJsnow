

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste LogicaVendaTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class LogicaVendaTest
{
    /**
     * Construtor default para a classe de teste LogicaVendaTest
     */
    public LogicaVendaTest()
    {
    }

    /**
     * Define a .
     *
     * Chamado antes de cada método de caso de teste.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Chamado após cada método de teste de caso.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void teste3()
    {
        Produto produto1 = new Produto(12, "A", 30, 50);
        Venda venda1 = new Venda();
        ItemVenda itemVend1 = new ItemVenda();
        LogicaVenda logicaVe1 = new LogicaVenda();
        venda1.setTotal(50);
        venda1.setData("22 de fevereiro");
        itemVend1.setQuantidade(1);
        itemVend1.setProduto(produto1);
        itemVend1.setPrecoVenda(65);
        assertEquals(50, venda1.getTotal(), 0.1);
        assertEquals(, venda1.getItens());
        assertEquals(, venda1.getEstadoDoCliente());
        assertEquals(, venda1.getData());
        venda1.addNoCarrinho(itemVend1, 0);
        assertEquals(, logicaVe1.calculaLucroTotal(venda1), 0.1);
        itemVend1.setLucro(15);
        assertEquals(15, logicaVe1.calculaLucroTotal(venda1), 0.1);
        assertEquals(68.25, logicaVe1.calcularTotal(venda1), 0.1);
        assertEquals(15, logicaVe1.calculaLucroTotal(venda1), 0.1);
    }
}

