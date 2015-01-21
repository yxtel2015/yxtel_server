package cn.com.yxtel.client.model;

public class ProductModel {

	String name;
	int qty;
	String mail;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", qty=" + qty + "]";
	}

}