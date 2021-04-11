package JavaSEEnumerations;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
	
	private static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);
	private int id;
	private String name;
	private BigDecimal price;
	private Rating rating;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscount() {
		return price.multiply(DISCOUNT_RATE).setScale(2,RoundingMode.HALF_UP);
	}
	public Rating getRating() {
		return rating;
	}
	
}
