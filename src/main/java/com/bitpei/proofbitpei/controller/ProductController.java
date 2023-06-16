package com.bitpei.proofbitpei.controller;

import com.bitpei.proofbitpei.model.Product;
import com.bitpei.proofbitpei.model.User;
import com.bitpei.proofbitpei.repository.UserRepository;
import com.bitpei.proofbitpei.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// CRUD Create  -   Read    -   Update  -   Delete
// HTTP POST    -   GET     -   PUT     -   DELETE
@RestController
@RequestMapping(path = "/api/productos/")
public class ProductController {
    private final ProductService productService;
    private final UserRepository userRepository;

    @Autowired
    public ProductController(ProductService productService, UserRepository userRepository) {
        this.productService = productService;
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProductos();
    }//GETAllProducts

    @GetMapping(path = "{prodID}")
    public Product getProduct(@PathVariable("prodID") Long id) {
        return productService.getProducto(id);
    }//GETProduct

    @DeleteMapping(path = "{prodID}")
    public Product deleteProduct(@PathVariable("prodID") Long id) {
        return productService.deleteProducto(id);
    }//DELETEproduct

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        Long createdBy = product.getCreatedBy().getId();
        User user = userRepository.findById(createdBy)
                .orElseThrow(
                        () -> new IllegalArgumentException("El usuario con id " + createdBy + " no existe para vincularlo a la creacion del producto")
                );

        product.setCreatedBy(user);
        return productService.createProducto(product);
    }


    @PutMapping(path = "{prodID}")
    public Product updateProduct(@PathVariable("prodID") Long id,
                                 @RequestParam(required = false) String name,
                                 @RequestParam(required = false) String brand,
                                 @RequestParam(required = false) String description,
                                 @RequestParam(required = false) String urlImagen,
                                 @RequestParam(required = false) Double price,
                                 @RequestParam(required = false) boolean active,
                                 @RequestParam(required = false) Long created_by) {
        User user = null;
        if (created_by != null) {
            user = userRepository.findById(created_by)
                    .orElseThrow(() -> new IllegalArgumentException("El Usuario con id " + created_by + " no existe"));
        }
        System.out.println(price);
        return productService.updateProducto(id, name, brand, description, urlImagen, price, active, user);
    }

}//class ProductoController
