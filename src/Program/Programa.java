package Program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Programa {

	public static void main(String[] args) throws ParseException {
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
	
		System.out.println("Quantos produtos voce quer cadastrar");
		int quantidade = sc.nextInt();
		for(int i = 0 ; i < quantidade ; i++) {
			System.out.println("Qual e classificação do produto(c/u/i)");
			char preci = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Digite o nome");
			String name = sc.nextLine();
			System.out.println("Digite o preço");
			double preco = sc.nextDouble();
			
			if(preci == 'i') {
				System.out.println("Desconto");
				double desc = sc.nextDouble();
				Product c1 = new ImportedProduct(name,preco,desc);
				list.add(c1);
			}else if(preci == 'u') {
				System.out.println("Digite a data");
				String data = sc.next();
				Date date = sdf.parse(data);
				Product c1 = new UsedProduct(name,preco,date);
				list.add(c1);
			}else {
				Product c1 = new Product(name,preco);
				list.add(c1);
			}
		}
		for(Product ti : list) {
			System.out.println(ti.priceTag());
		}

	}

}
