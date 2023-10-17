package aula02.controlFlow.exer02.main;

import aula02.controlFlow.exer02.inventory.Inventory;
import aula02.controlFlow.exer02.inventory.Product;
import aula02.controlFlow.exer02.inventory.Warehouse;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.productId = 1234;
        product.ProductName = "Iphone20";
        product.Price = 10000;

        Inventory inventory = new Inventory();
        inventory.quantity = 10;
        inventory.product = product;

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 32;
        warehouse.warehouseName = "ArmazemParaiba";
        warehouse.inventories = "seiLa";

        System.out.println();
        System.out.println();
        System.out.println();


    }
}
