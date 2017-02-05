package com.trouvere.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	private String password;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Orders> order;

	// shoppingBag;
	// @Column(name = "product")
	@OneToMany
	private Set<Product> product;

	public User() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Orders> getOrder() {
		return order;
	}

	public void setOrder(List<Orders> order) {
		this.order = order;
	}

	public Set<Product> getShoppingBag() {
		return product;
	}

	public void setShoppingBag(Set<Product> shoppingBag) {
		this.product = shoppingBag;
	}

}
