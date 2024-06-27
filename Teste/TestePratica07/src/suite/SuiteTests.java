package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testes.ClienteTeste;
import testes.CompraTeste;
import testes.EstoqueTeste;
import testes.FornecedorTeste;
import testes.ProdutoTeste;
import testes.VendasTeste;

@RunWith(Suite.class)
@SuiteClasses({ ClienteTeste.class, CompraTeste.class, EstoqueTeste.class, FornecedorTeste.class, ProdutoTeste.class,
		VendasTeste.class })
public class SuiteTests {

}
