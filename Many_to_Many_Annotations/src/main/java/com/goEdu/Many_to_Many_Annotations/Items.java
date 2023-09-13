package com.goEdu.Many_to_Many_Annotations;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Items_Many_to_Many")
public class Items {
	@Id
	@Column(name = "ItemId")
	private int itemId;
	@Column(name = "ItemName")
	private String itemName;
	@ManyToMany(targetEntity = Categories.class,mappedBy = "items")
	
	private Set<Categories>categories;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Set<Categories> getCategories() {
		return categories;
	}

	public void setCategories(Set<Categories> categories) {
		this.categories = categories;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

}
