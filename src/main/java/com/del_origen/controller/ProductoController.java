package com.del_origen.controller;

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
	
	@RequestMapping("/productos")
    public String getAll(){
     // return productoService.getAll();
       return "hola mundo";
    }
}
