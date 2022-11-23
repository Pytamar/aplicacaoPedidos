package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		
		System.out.println("Entre com a data do cliente: ");
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Email: ");
		String email = teclado.next();
		System.out.print("Data de nascimento (dd/mm/yyyy): ");
		Date mes = sdf.parse(teclado.next());
		
		Client cliente = new Client(nome, email, mes);
		
		System.out.println("Entre com os dados: ");
		System.out.print("Status: ".toUpperCase());
		OrderStatus status = OrderStatus.valueOf(teclado.next());
		
		Order order = new Order(mes, status, cliente);
		
		System.out.println("Quantos itens nesse carrinho? ");
		int n = teclado.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Entre com #" + i + " dados do item: ");
			System.out.print("Nome do produto: ");
			teclado.nextLine();
			String produto = teclado.nextLine();
			System.out.print("Valor do produto: ");
			double preçoProduto = teclado.nextDouble();
			
			Product produtos = new Product(nome, preçoProduto);
			
			System.out.print("Quantidade: ");
			int quantidade = teclado.nextInt();
			
			OrderItem orderItem = new OrderItem(quantidade, preçoProduto, produtos);
			
			order.adicionaItem(orderItem);
		}
		
		System.out.println(" ");
		System.out.println("Sumario do pedido!!!");
		System.out.println(order);
		
		
		
		
		
	}

}
