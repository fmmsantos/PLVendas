package com.PLVendas.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venda {
	private int codigo;
    private int produtosCodigo;
    private int clientesCodigo;
    private LocalDate dataVenda;
    private int quantidade;
    private Double valor;
    private Float valorTotal;
    private Float desconto;
    private ArrayList<Venda> listaVendas;

}
