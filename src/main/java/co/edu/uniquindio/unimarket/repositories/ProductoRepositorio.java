package co.edu.uniquindio.unimarket.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uniquindio.unimarket.models.Producto;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto, Long>{

}
