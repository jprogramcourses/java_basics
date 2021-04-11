package JavaSEStreams;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.openjdk.jmh.annotations.Benchmark;

import JavaSEEnumerations.Product;

public class MainJavaSEStreams {
	
	@Benchmark
	public void init() {
		
	}

	public static void main(String[] args) {
		
		try {
			org.openjdk.jmh.Main.main(args);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Product> listProducts = createListProducts();
		
		listProducts.stream().filter(p -> p.getPrice().intValue() > 10).forEach(p -> System.out.println(p.getName()));

		System.out.println("*********** Reduce examples 1 ******************");
		Optional<String> reduceEx1 = ReduceExamples.reduceExample1();
		System.out.println("Reduce example 1: " + reduceEx1);

		System.out.println("*********** Reduce examples 2 ******************");
		ReduceExamples.reduceExample2();
		
		System.out.println("*********** Reduce examples 3 ******************");
		ReduceExamples.reduceExample3();
		
	}
	
	private static List<Product> createListProducts(){
		
		List<Product> list = new ArrayList<>();
		
		Product prod1 = new Product();
		prod1.setId(1);
		prod1.setName("Producto 1");
		prod1.setPrice(BigDecimal.valueOf(1.25));
		Product prod2 = new Product();
		prod2.setId(2);
		prod2.setName("Producto 2");
		prod2.setPrice(BigDecimal.valueOf(2.25));
		Product prod3 = new Product();
		prod3.setId(2);
		prod3.setName("Producto 3");
		prod3.setPrice(BigDecimal.valueOf(10.25));
		Product prod4 = new Product();
		prod4.setId(4);
		prod4.setName("Producto 4");
		prod4.setPrice(BigDecimal.valueOf(15.65));
		
		list.add(prod1);
		list.add(prod2);
		list.add(prod3);
		list.add(prod4);
		
		return list;
		
	}

}
