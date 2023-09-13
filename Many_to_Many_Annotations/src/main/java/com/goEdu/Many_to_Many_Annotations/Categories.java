package com.goEdu.Many_to_Many_Annotations;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "Categories_Many_to_Many")
public class Categories {
	@Id
	@Column(name = "Categories_Id")
	private int categoriesId;
	@Column(name = "Category_Name")
	private String categoryName;
	@ManyToMany(targetEntity = Items.class,cascade = CascadeType.ALL)
	@JoinTable(name = "Categories_Items",joinColumns = @JoinColumn(name="categories_id_fk",referencedColumnName = "Categories_Id"),
	                 inverseJoinColumns =@JoinColumn(name="items_id_fk",referencedColumnName = "itemId") )
	private Set<Items>items;

	public int getCategoriesId() {
		return categoriesId;
	}

	public void setCategoriesId(int categoriesId) {
		this.categoriesId = categoriesId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Items> getItems() {
		return items;
	}

	public void setItems(Set<Items> items) {
		this.items = items;
	}

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
