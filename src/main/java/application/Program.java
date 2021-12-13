package application;

import entities.Client;
import entities.OrderItem;
import entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        Product product = new Product("TV", 1000.0);

        OrderItem orderItem = new OrderItem(6, 1000.0, product);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Client client = new Client("Thalita", "sribeiro.thalita@gmail.com", simpleDateFormat.parse("14/06/2000"));

        System.out.println(orderItem.toString());
        System.out.println(client.toString());

        scanner.close();
    }
}
