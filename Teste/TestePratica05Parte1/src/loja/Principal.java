package loja;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        boolean clienteVIP = false;

        Produto p1 = new Produto("Arroz", 5, 18.75);
        Produto p2 = new Produto("Feijão", 1, 4.95);
        Produto p3 = new Produto("Leite", 1, 3.49);
        List<Produto> produtos = new ArrayList<>(); //Troca de ArrayList pra List
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        InterfaceRelatorio relatorio = new Relatorio();
        double total = relatorio.calcularTotal(produtos, clienteVIP);

        System.out.println(total);
    }
}