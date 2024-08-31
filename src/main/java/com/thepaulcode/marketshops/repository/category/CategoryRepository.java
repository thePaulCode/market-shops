package com.thepaulcode.marketshops.repository.category;

import com.thepaulcode.marketshops.entity.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {
    Category findByName(String name);
}
