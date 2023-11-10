package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "banktransactions")
public class BankTransaction {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transactionid", nullable = false)
    private Long transactionId;

    @Column(name = "transactiondate")
    private String transactionDate;

    @Column(name = "fromaccount", length = 20)
    private String fromAccount;

    @Column(name = "toaccount", length = 20)
    private String toAccount;

    @Column(name = "amount")
    private Float amount;

    public BankTransaction() {
        super();
    }

	public BankTransaction(Long transactionId, String transactionDate, String fromAccount, String toAccount,
			Float amount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankTransaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", fromAccount=" + fromAccount + ", toAccount=" + toAccount + ", amount=" + amount + "]";
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}

	public String getToAccount() {
		return toAccount;
	}

	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	public Float getAmount() {
		return amount;
	}

	public void setAmount(Float amount) {
		this.amount = amount;
	}
}
