package com.del_origen.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.del_origen.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long>{
	
	
}
