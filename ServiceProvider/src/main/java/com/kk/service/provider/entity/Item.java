package com.kk.service.provider.entity;

public class Item {

	private String itemId;

	public Item(String itemId, String itemDesc, Long qty) {
		super();
		this.itemId = itemId;
		this.itemDesc = itemDesc;
		this.qty = qty;
	}

	public Item() {

	}

	private String itemDesc;
	private Long qty;

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

	public Long getQty() {
		return qty;
	}

	public void setQty(Long qty) {
		this.qty = qty;
	}
}
