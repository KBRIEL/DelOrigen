package com.del_origen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Producto {
	

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @GenericGenerator(name = "native", strategy = "native")
	    private Long producto_id;
	    @Column
	    private String nombre;
	    
	    
		public Producto(String nombre) {
			super();
			this.nombre = nombre;
		}
		
		
		public Long getProducto_id() {
			return producto_id;
		}
		public void setProducto_id(Long producto_id) {
			this.producto_id = producto_id;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
}
