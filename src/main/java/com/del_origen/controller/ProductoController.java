package com.del_origen.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.del_origen.entity.Producto;
import com.del_origen.entity.dto.ProductoDto;
import com.del_origen.service.ProductoService;



@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@RequestMapping("/producto")
    public String getProducto(){
     // return productoService.getAll();
       return "hola mundo";
    }
	
	@RequestMapping("/productos")
    public ArrayList<String> getAll(){
		ArrayList<String> lista= new ArrayList<String>();
		lista.add("hola mundo");
		lista.add("bien venidos");
       return lista;
    }
}
