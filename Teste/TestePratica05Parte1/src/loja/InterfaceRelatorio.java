package loja;

import java.util.List;

public interface InterfaceRelatorio {
	double calcularTotal(List<Produto> produtos, boolean clienteVIP);
    double aplicarDesconto(double total, boolean clienteVIP);
    double adicionarTaxaEntrega(double total);
}

