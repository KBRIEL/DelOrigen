package com.del_origen.entity.dto;

import com.del_origen.entity.Producto;

public class ProductoDto {
	
	 private Long producto_id;
	
	 private String nombre;
	    
	    
	 public  ProductoDto(Producto producto) {
			
			this.producto_id = producto.getProducto_id();
			this.nombre = producto.getNombre();
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
