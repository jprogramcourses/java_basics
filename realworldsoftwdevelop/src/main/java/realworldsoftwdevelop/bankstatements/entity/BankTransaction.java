package realworldsoftwdevelop.bankstatements.entity;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction {
	
	private final LocalDate date;
	private final Double amount;
	private final String description;

	public BankTransaction(LocalDate date, Double amount, String description) {
		this.date = date;
		this.amount = amount;
		this.description = description;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "BankTransaction [date=" + date + ", amount=" + amount + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, amount, description);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;
		BankTransaction that = (BankTransaction) obj;
		return Double.compare(that.amount, amount) == 0 && date.equals(that.date) && description.equals(that.description);
	}

}
