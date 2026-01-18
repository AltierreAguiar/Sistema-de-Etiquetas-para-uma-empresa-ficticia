package application;
import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        System.out.print("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter product #" + i + " data: ");
            System.out.print("Common, used or imported? (c, u ou i)");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            if(ch == 'i'){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customFee));
            } else if (ch == 'u') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                sc.nextLine();
                System.out.print("Manufacture Date: (DD/MM/YYYY)");
                String manufactureDate = sc.nextLine();
                list.add(new UsedProduct(name, price, manufactureDate));
            }else if (ch == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                list.add(new Product(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS");
        for (Product p : list){
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}