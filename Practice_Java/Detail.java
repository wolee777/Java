package com.example;

import java.math.BigDecimal;

public class Detail {
	// ��ǰ��
	private String itemName;
	// �ݾ�
	private BigDecimal amount;
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
