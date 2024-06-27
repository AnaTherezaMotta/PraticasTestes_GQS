package loja;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

public class Relatorio implements InterfaceRelatorio {

    private LocalDate data;

    public Relatorio() {
        this.data = LocalDate.now();
    }

    public Relatorio(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularTotal(List<Produto> produtos, boolean clienteVIP) {
        double total = 0.0;
        for (Produto produto : produtos) {
            total += produto.getPreco() * produto.getQuantidade();
        }
        total = aplicarDesconto(total, clienteVIP);
        return adicionarTaxaEntrega(total);
    }

    @Override
    public double aplicarDesconto(double total, boolean clienteVIP) {
        if (clienteVIP) {
            return total * 0.90;
        } else {
            return total * 0.95;
        }
    }

    @Override
    public double adicionarTaxaEntrega(double total) {
        DayOfWeek diaSemana = this.data.getDayOfWeek();
        if (diaSemana == DayOfWeek.SUNDAY) {
            return total + 10.00;
        } else {
            return total + 5.00;
        }
    }
}