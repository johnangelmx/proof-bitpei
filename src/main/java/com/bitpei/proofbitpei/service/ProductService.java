package com.bitpei.proofbitpei.service;

import com.bitpei.proofbitpei.model.Product;
import com.bitpei.proofbitpei.model.User;
import com.bitpei.proofbitpei.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired //Autoconectar
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProductos() {
        return productRepository.findByActive(true);
    }//GETallproductos


    public Product getProducto(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        if (product != null && product.isActive()) {
            return product;
        } else {
            throw new IllegalArgumentException("El Producto con id " + id + " no existe o no está activo");
        }
    }

    public Product deleteProducto(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            // Realizar la desvinculación o desactivación del producto
            product.setActive(false);
            productRepository.save(product);

            return product;
        }

        return null;
    }//DELETEproducto


    public Product createProducto(Product producto) {
        return productRepository.save(producto);
    }//CREATEproducto

    public Product updateProducto(Long id, String nombre, String marca, String descripcion, String urlImagen, Double precio, Boolean activo, User creadoPor) {
        Product tmp = null;
        if (productRepository.existsById(id)) {
            tmp = productRepository.findById(id).get();
            if (nombre != null) tmp.setName(nombre);
            if (marca != null) tmp.setBrand(marca);
            if (descripcion != null) tmp.setDescription(descripcion);
            if (urlImagen != null) tmp.setUrlImage(urlImagen);
            System.out.println(precio);
            if (precio != null) tmp.setPrice(precio.doubleValue());
            if (activo != null) tmp.setActive(activo);
            if (creadoPor != null) tmp.setCreatedBy(creadoPor);
            System.out.println(tmp);
            productRepository.save(tmp);
        } else {
            System.out.println("Update - El Producto con Id " + id + " no existe");
        }
        return tmp;
    }


}// class ProductoService
