package org.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// Repository interface

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
